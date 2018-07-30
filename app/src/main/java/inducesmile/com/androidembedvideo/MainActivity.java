package inducesmile.com.androidembedvideo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String frameAudio = "<iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1KERIMHewCm5z2ThzZGlOgchjFnL5Nd_0/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        final String frameAudio1 = "<iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/16xpJAchxMAgtGpEdkSZHu-lfDIUdz7WO/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        final String frameAudio2 = "<iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1kVfdWzVUnGu1K9Aly09qs1kMt_UoIoBO/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        final String frameAudio3 = "<iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1HatHk_3jPwbjE04THnJD_tcB1EYRD8it/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        final String frameAudio4 ="http:/10.51.8.207:8080/my_server/College_Gate.mp3";


        final WebView displayAudio = (WebView)findViewById(R.id.webView);
        final WebView displayAudio1 = (WebView)findViewById(R.id.webView1);
        final WebView displayAudio2 = (WebView)findViewById(R.id.webView2);
        final WebView displayAudio3 = (WebView)findViewById(R.id.webView3);
        final WebView displayAudio4 = (WebView)findViewById(R.id.webView4);

        Button playAudio = (Button) findViewById(R.id.button);
        Button playAudio1 = (Button) findViewById(R.id.button1);
        Button playAudio2 = (Button) findViewById(R.id.button2);
        Button playAudio3 = (Button) findViewById(R.id.button3);
        Button playAudio4 = (Button) findViewById(R.id.button4);

        playAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAudio.setVisibility(VISIBLE);
                displayAudio.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });
                WebSettings webSettings = displayAudio.getSettings();
                webSettings.setJavaScriptEnabled(true);
                displayAudio.loadData(frameAudio, "text/html", "utf-8");
            }
        });

        playAudio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAudio1.setVisibility(VISIBLE);
                displayAudio1.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });
                WebSettings webSettings1 = displayAudio1.getSettings();
                webSettings1.setJavaScriptEnabled(true);
                displayAudio1.loadData(frameAudio1, "text/html", "utf-8");

            }
        });

        playAudio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAudio2.setVisibility(VISIBLE);
                displayAudio2.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });
                WebSettings webSettings2 = displayAudio2.getSettings();
                webSettings2.setJavaScriptEnabled(true);
                displayAudio2.loadData(frameAudio2, "text/html", "utf-8");
            }
        });

        playAudio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAudio3.setVisibility(VISIBLE);
                displayAudio3.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });
                WebSettings webSettings3 = displayAudio3.getSettings();
                webSettings3.setJavaScriptEnabled(true);
                displayAudio3.loadData(frameAudio3, "text/html", "utf-8");
            }
        });

        playAudio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAudio4.setVisibility(VISIBLE);
                displayAudio4.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });
                WebSettings webSettings4 = displayAudio4.getSettings();
                webSettings4.setJavaScriptEnabled(true);
                displayAudio4.loadData(frameAudio4, "audio/mpeg", "utf-8");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
