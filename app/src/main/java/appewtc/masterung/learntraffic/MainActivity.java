package appewtc.masterung.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget คือการผูกความสัมพันธ์ ของ Variable and Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์ จากการคลิกปุ่ม
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/AFmWqLIqDZA"));
                startActivity(intent);
            }   // onClick
        });

    }   // Main Method นีี่คือ เมธอด คะ

}   // Main Class นี่คือคลาสหลัก คะ
