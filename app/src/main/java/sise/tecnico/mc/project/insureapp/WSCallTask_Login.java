package sise.tecnico.mc.project.insureapp;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import pt.ulisboa.tecnico.sise.insure.datamodel.ClaimItem;
import pt.ulisboa.tecnico.sise.insure.datamodel.ClaimMessage;
import pt.ulisboa.tecnico.sise.insure.datamodel.ClaimRecord;
import pt.ulisboa.tecnico.sise.insure.datamodel.Customer;

//Objecto com as duas coisas

public class WSCallTask_Login extends AsyncTask<Void, String, Void> {
    public final static String TAG = "CallTask";
    private TextView _textView;

    user name e paswwor como argumento e guarda-lo em variavei internas

    public WSCallTask_Login(TextView textView) {
        _textView = textView;
    }

    @Override
    protected Void doInBackground(Void... params) {
        int sessionId = -1;
        /*
         * Test method call invocation: hello
         */
        publishProgress("Testing method call hello...");
        try {
            String r = WSHelper.hello("John Doe");
            Log.d(TAG, "Hello result => " + r);
            publishProgress("ok.\n");
        } catch (Exception e) {
            Log.d(TAG, e.toString());
            publishProgress("failed.\n");
        }


    @Override
    protected void onProgressUpdate(String... values) {
        if(values.length > 0) {
            _textView.append(values[0]);
        }
    }

    @Override
    protected void onPostExecute(Void result) {
        _textView.append("finished testing");
        Log.d(TAG,"finished testing");
    }
}