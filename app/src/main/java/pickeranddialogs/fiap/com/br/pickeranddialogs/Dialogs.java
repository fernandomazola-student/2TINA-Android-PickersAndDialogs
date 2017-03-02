package pickeranddialogs.fiap.com.br.pickeranddialogs;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Dialogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);


    }

//    public void salvar(View v){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle(R.string.titulo);
//        builder.setMessage(R.string.msg);
//        builder.setCancelable(false);
//        builder.setIcon(android.R.drawable.ic_dialog_alert);
//        //builder.setNeutralButton(R.string.fechar, null);
//        builder.setNegativeButton(R.string.fechar, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(Dialogs.this, getString(R.string.clicou_em_fechar), Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(Dialogs.this, getString(R.string.clicou_em_ok), Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.show();
//    }

    public void salvar1 (View v){
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Cagrrenando");
        progressDialog.setMessage("Aguarde...");
        progressDialog.show();
    }
}
