package howe.helloandroidstudio;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.internal.util.Predicate;
import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;



class MainActivity extends AppCompatActivity {


    @Bind(R.id.lblTitle)
    TextView lblTitle;
    @Bind(R.id.btnInnerSD)
    Button btnInnerSD;
    @Bind(R.id.btnExtSD)
    Button btnExtSD;
    @Bind(R.id.llTools)
    LinearLayout llTools;
    @Bind(R.id.txtReScan)
    EditText txtReScan;
    @Bind(R.id.btnRescan)
    Button btnRescan;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @OnClick({R.id.btnInnerSD, R.id.btnExtSD, R.id.btnRescan})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnInnerSD:
                this.btnInnerSD_OnClick();
                break;
            case R.id.btnExtSD:
                this.btnExtSD_OnClick();
                break;
            case R.id.btnRescan:
                this.btnRescan_OnClick();
                break;
        }
    }

    private void btnInnerSD_OnClick() {
        this.txtReScan.setText(this.getInnerSDCardPath());
    }

    private void btnExtSD_OnClick() {
//        this.txtReScan.setText(this.getInnerSDCardPath());
        this.txtReScan.setText("/storage/sdcard1/安记/");

        List<String> list = Arrays.asList("ABCCCD", "BCD", "CDS", "ABC1", "CDEFG", "ABC");
        List<String> collectedList = Stream.of(list)
                .filter(i-> i.startsWith("ABC"))
                .sorted()
                .collect(Collectors.toList())
                ;

        for(String i : collectedList)
        {
            String tmp = i;
        }


        List<DeliveryOrder> orderList = new ArrayList<DeliveryOrder>();

        //region Init Data
        DeliveryOrder order1 = new DeliveryOrder();
        order1.setOrderNo("SO170225002");
        order1.setEntryDateTime(new Date(2017, 1, 25, 11, 17 ,0));
        order1.setActived(true);
        order1.setTotalQty(1000);
        order1.setTotalPrice(100000);
        orderList.add(order1);

        DeliveryOrder order2 = new DeliveryOrder();
        order2.setOrderNo("SO170225002");
        order2.setEntryDateTime(new Date(2017, 1, 25, 11, 20 ,0));
        order2.setActived(true);
        order2.setTotalQty(5000);
        order2.setTotalPrice(555555);
        orderList.add(order2);

        DeliveryOrder order3 = new DeliveryOrder();
        order3.setOrderNo("SO170201002");
        order3.setEntryDateTime(new Date(2017, 1, 1, 11, 20 ,0));
        order3.setActived(false);
        order3.setTotalQty(100);
        order3.setTotalPrice(10000);
        orderList.add(order3);


        DeliveryOrder order4 = new DeliveryOrder();
        order4.setOrderNo("SO170225003");
        order4.setEntryDateTime(new Date(2017, 1, 25, 11, 20 ,0));
        order4.setActived(true);
        order4.setTotalQty(5000);
        order4.setTotalPrice(555555);
        orderList.add(order4);
        //endregion

        List<DeliveryOrder> collectOrderList = Stream.of(orderList)
                .filter(i-> i.getActived().equals(true)
                            && i.getOrderNo().startsWith("SO170225")
                            && i.getTotalPrice() > 300000
                            && ( i.getEntryDateTime().equals(new Date(2017, 1, 25)) || i.getEntryDateTime().after(new Date(2017, 1, 25)) )
                        )
                // .sortBy(DeliveryOrder::getTotalPrice) // 排序, 未能类似实现C#的 OrderBy().ThenBy() 功能
                .sorted((p1, p2) -> DeliveryOrderCompartor.Comparing(p1, p2))
                .collect(Collectors.toList());

        String a = collectedList.toString();
    }

    private void btnRescan_OnClick() {
        String dest = this.txtReScan.getText().toString();
        this.rescanFolder(dest);
    }

    private void rescanFolder(String dest) {
        // Scan files only (not folders);
        File test = new File(dest);
        File[] files = new File(dest).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });

        if (files == null) {
            Toast.makeText(MainActivity.this.getApplicationContext(), "目录为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String[] paths = new String[files.length];
        for (int co = 0; co < files.length; co++) {
            paths[co] = files[co].getAbsolutePath();
        }

        MediaScannerConnection.scanFile(MainActivity.this, paths, null, null);
        // and now recursively scan subfolders
        files = new File(dest).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        for (int co = 0; co < files.length; co++) {
            rescanFolder(files[co].getAbsolutePath());
        }
    }

    /**
     * 获取内置SD卡路径
     *
     * @return
     */
    public String getInnerSDCardPath() {
        return Environment.getExternalStorageDirectory().getPath();
    }

    /**
     * 获取外置SD卡路径
     *
     * @return 应该就一条记录或空
     */
    public List<String> getExtSDCardPath() {
        List<String> lResult = new ArrayList<String>();
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("mount");
            InputStream is = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("extSdCard")) {
                    String[] arr = line.split(" ");
                    String path = arr[1];
                    File file = new File(path);
                    if (file.isDirectory()) {
                        lResult.add(path);
                    }
                }
            }
            isr.close();
        } catch (Exception e) {

        }
        return lResult;
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
