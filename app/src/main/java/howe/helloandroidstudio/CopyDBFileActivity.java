package howe.helloandroidstudio;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Howe on 2016/9/29.
 */

public class CopyDBFileActivity extends AppCompatActivity {


    @Bind(R.id.btnCopyData2SD)
    Button btnCopyData2SD;
    @Bind(R.id.btnCopySD2Data)
    Button btnCopySD2Data;
    @Bind(R.id.btnCreateData)
    Button btnCreateData;
    @Bind(R.id.btnDeleteSD)
    Button btnDeleteSD;
    @Bind(R.id.btnDeleteData)
    Button btnDeleteData;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_copydbfile);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btnCopyData2SD, R.id.btnCopySD2Data, R.id.btnCreateData, R.id.btnDeleteSD, R.id.btnDeleteData})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCopyData2SD:
                break;
            case R.id.btnCopySD2Data:
                break;
            case R.id.btnCreateData:
                break;
            case R.id.btnDeleteSD:
                break;
            case R.id.btnDeleteData:
                break;
        }
    }

    private void btnCreateData()
    {

    }
}
