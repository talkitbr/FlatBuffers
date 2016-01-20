using FlatBuffers;
using FlatBuffersWindows.model.vo.fb;
using FlatBuffersWindows.model.vo.json;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.Storage;
using Windows.Storage.Streams;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace FlatBuffersWindows
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        public MainPage()
        {
            this.InitializeComponent();
        }

        private void btnLoadFlatBuffer_Click(object sender, RoutedEventArgs e)
        {
            Uri appUri = new Uri((@"ms-appx:///data/imoveis.fb"));
            StorageFile fbFile = StorageFile.GetFileFromApplicationUriAsync(appUri).AsTask().ConfigureAwait(false).GetAwaiter().GetResult();
            IBuffer buffer = FileIO.ReadBufferAsync(fbFile).AsTask().ConfigureAwait(false).GetAwaiter().GetResult();

            byte[] content = new byte[buffer.Length];

            using (DataReader reader = DataReader.FromBuffer(buffer))
            {
                reader.ReadBytes(content);
            }

            ByteBuffer bb = new ByteBuffer(content);

            long start = System.DateTime.Now.Ticks;

            Imoveis imoveis = Imoveis.GetRootAsImoveis(bb);

            long end = System.DateTime.Now.Ticks;

            lblFlatBufferLoadingTime.Text = "Tempo de carregamento: " + ((end - start) / 10000) + " milissegundos";

            Debug.WriteLine("Apartamentos carregados: " + imoveis.AptosLength + ". Casas carregadas: " + imoveis.CasasLength);
        }

        private void btnLoadJSON_Click(object sender, RoutedEventArgs e)
        {
            Uri appUri = new Uri((@"ms-appx:///data/imoveis.json"));
            StorageFile jsonFile = StorageFile.GetFileFromApplicationUriAsync(appUri).AsTask().ConfigureAwait(false).GetAwaiter().GetResult();
            string jsonText = FileIO.ReadTextAsync(jsonFile).AsTask().ConfigureAwait(false).GetAwaiter().GetResult();

            JsonSerializerSettings settings = new JsonSerializerSettings { TypeNameHandling = TypeNameHandling.All };

            long start = System.DateTime.Now.Ticks;

            ImoveisJSON imoveis = JsonConvert.DeserializeObject<ImoveisJSON>(jsonText, settings);

            long end = System.DateTime.Now.Ticks;

            lblJSONLoadingTime.Text = "Tempo de carregamento: " + ((end - start) / 10000) + " milissegundos";

            Debug.WriteLine("Apartamentos carregados: " + imoveis.aptos.Count + ". Casas carregadas: " + imoveis.casas.Count);
        }
    }
}
