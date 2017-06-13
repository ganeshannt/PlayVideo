package ganeshannt.playvideo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity{

    Button clk;
    VideoView videov;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoView);
        mediac = new MediaController(this);

    }

    public void videoplay(View v)
    {
       String videopath = "android.resource://ganeshannt.playvideo/"+R.raw.google;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();
    }

}