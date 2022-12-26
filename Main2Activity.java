package horario.android.app;


import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import 	android.view.InputEvent;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.app.Activity;
import android.os.Bundle;




import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import java.io.File;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.lang.Object;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;

import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.Exception;
import java.io.IOException;
import android.webkit.WebView;
import android.view.KeyEvent.Callback;
import java.lang.Object;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast; 
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import 	android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.app.ListActivity;
import java.io.*;


import 	java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import android.util.Base64;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;





public class Main2Activity extends Activity 
{
	int nn;

	SQLiteDatabase db;
	Cursor cursor;
	private Button btn;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;

	private Button btn6;
	private int iii;

	private Context context;
	String st="";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar);
		iii=-1;
		setTitle("modificar adicionar obra");
		context=this;

		btn = (Button) findViewById(R.id.add); 	
		btn1 = (Button) findViewById(R.id.cancelar); 	
		btn2 = (Button) findViewById(R.id.modificar); 	
		btn3 = (Button) findViewById(R.id.limpar); 	
		btn4 = (Button) findViewById(R.id.apagar); 	

		btn6 = (Button) findViewById(R.id.listas); 
		final EditText ED = (EditText)findViewById(R.id.enome);

		final EditText ED2 = (EditText)findViewById(R.id.emorada);
		final EditText ED3 = (EditText)findViewById(R.id.eemail);
		final EditText ED4 = (EditText)findViewById(R.id.eobservacao);

		btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					File f2=new File("/sdcard/app.android/horario.omnitecnica.app/horario.data");

					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

					String s="INSERT INTO obras (nome,morada,obra,observacoes) VALUES ('"+ED.getText()+"','"+ED2.getText()+"','"+ED3.getText()+"','"+ED4.getText()+"')";
					setTitle(s);
					db.execSQL(s);

					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn1.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  



					finish(); 





				}});



		btn2.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("modificar");

					ContentValues cv = new ContentValues();
					File f2=new File("/sdcard/app.android/horario.omnitecnica.app/horario.data");

					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("obras","Id<0",null);

					cv.put("nome",ED.getText().toString());
					cv.put("morada",ED2.getText().toString());
					cv.put("obra",ED3.getText().toString());
					cv.put("observacoes",ED4.getText().toString());
					db.update("obras", cv, "Id="+Integer.toString( iii), null);

					db.delete("obras","Id<0",null);
					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn3.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					iii=-1;
					ED.setText("");

					ED2.setText("");
					ED3.setText("");
					ED4.setText("");

				}});



		btn4.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("apagar");

					File f2=new File("/sdcard/app.android/horario.omnitecnica.app/horario.data");

					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("obras","Id<0",null);
					db.delete("obras","Id="+Integer.toString(iii),null);

					db.delete("obras","Id<0",null);
					db.close();


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  


					finish(); 


				}});



		btn6.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle(st);

					if(iii!=-1){
						Intent intent = new Intent(context,Main3Activity.class);
startActivity(intent);  
					}else{
						Intent intent = new Intent(context,MainActivity.class);

						startActivity(intent);  

					}

					finish(); 





				}});


		File f2=new File("/sdcard/app.android/horario.omnitecnica.app/horario.data");

		db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

		cursor = db.query("comunicacao", new String[] { "Id","a", "b","c","d","e"},null,null,null,null,null ,null);

		if (cursor.moveToFirst()) {

			iii=Integer.parseInt( cursor.getString(1).trim());



			if(iii!=-1){
			ED.setText( cursor.getString(2));

			ED2.setText(cursor.getString(3));
			ED3.setText(cursor.getString(4));
			ED4.setText(cursor.getString(5));
}
		}
		st=cursor.getString(6);
try{
	
				
				
						
						}
						catch(Exception e){}
						
						
						
						
		cursor.close();

		db.close();
	
}

}



