package cultoftheunicorn.marvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.opencv.cultoftheunicorn.marvel.R;

public class aiktc_chtbt extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiktc_chtbt);
        webView= (WebView) findViewById(R.id.cht_web);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://young-piccolo-nggzbnwstzi.glitch.me");
        webView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();

        }       }
}
