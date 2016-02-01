package com.talkitbr.flatbuffersandroid;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talkitbr.flatbuffersandroid.model.vo.fb.Imoveis;
import com.talkitbr.flatbuffersandroid.model.vo.json.ImoveisJSON;

public class MainActivity extends AppCompatActivity {
    private TextView mFlatBuffersLoadingTime;

    private TextView mJSONLoadingTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loadFlatBufferButton = (Button) findViewById(R.id.activity_main_load_fb_button);
        Button loadJSONButton = (Button) findViewById(R.id.activity_main_load_json_button);
        mFlatBuffersLoadingTime = (TextView) findViewById(R.id.activity_main_fb_loading_time);
        mJSONLoadingTime = (TextView) findViewById(R.id.activity_main_json_loading_time);

        loadFlatBufferButton.setOnClickListener(new LoadFlatBufferButtonClickListener());
        loadJSONButton.setOnClickListener(new LoadJSONButtonClickListener());
    }

    private class LoadFlatBufferButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            InputStream is = null;

            try {
                is = getResources().getAssets().open("imoveis.fb");

                byte[] buffer = new byte[1024];
                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                int read;

                while ((read = is.read(buffer)) > 0) {
                    baos.write(buffer, 0, read);
                }

                ByteBuffer bb = ByteBuffer.wrap(baos.toByteArray());

                long start = System.currentTimeMillis();

                Imoveis imoveis = Imoveis.getRootAsImoveis(bb);

                long end = System.currentTimeMillis();

                mFlatBuffersLoadingTime
                        .setText("Tempo de carregamento: " + (end - start) + " milissegundos.");

                Log.d("talkitbr-FB", "Total de apartamentos carregados: " + imoveis.aptosLength()
                        + ", total de casas carregadas: " + imoveis.casasLength());
            } catch (IOException e) {
                Log.e("talkitbr-FB", "Ocorreu um erro ao carregar o FlatBuffer.", e);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        // Não faz nada
                    }
                }
            }
        }
    }

    private class LoadJSONButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            InputStream is = null;

            try {
                is = getResources().getAssets().open("imoveis.json");

                ObjectMapper mapper = new ObjectMapper();

                long start = System.currentTimeMillis();

                ImoveisJSON imoveis = mapper.readValue(is, ImoveisJSON.class);

                long end = System.currentTimeMillis();

                mJSONLoadingTime
                        .setText("Tempo de carregamento: " + (end - start) + " milissegundos.");

                Log.d("talkitbr-JSON",
                        "Total de apartamentos carregados: " + imoveis.getAptos().size()
                                + ", total de casas carregadas: " + imoveis.getCasas().size());
            } catch (IOException e) {
                Log.e("talkitbr-JSON", "Ocorreu um erro ao carregar o arquivo JSON.", e);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        // Não faz nada
                    }
                }
            }
        }
    }
}
