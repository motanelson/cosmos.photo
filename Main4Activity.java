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
import android.widget.CheckBox; 
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
import java.text.SimpleDateFormat;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Calendar;
import java.util.Date;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.TextWatcher;



public class Main4Activity extends Activity 
{
	int nn;
	SQLiteDatabase db;
	Cursor cursor;
	private Button btn;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;

	private int iii;
	private int entidade=-1;
	private Context context;
	private Boolean cchar(char c){
		String cc="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstvwxyz0123456789";
		try{
			if(cc.indexOf(c)<0)return false;
			}catch(Exception e){
				return false;
				}
				return true;
		
		}
		private String getdday(int i){
		String[] dayss= new String[]{"Dom","Seg","Ter","Qua","Qui","Sex","Sab","Dom","Seg"};
		return dayss[i];
		}
private Boolean rets(String s){
String ss=s.trim();
ss=ss.toLowerCase();
int i=0;
i=ss.indexOf("true");
if (i==0) return true;
	return false;
}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		String funcs="";
		int func2=-1;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar2);
		
		//setTitle();
		context=this;

		btn = (Button) findViewById(R.id.add); 	
		btn1 = (Button) findViewById(R.id.cancelar); 	
		btn2 = (Button) findViewById(R.id.modificar); 	
		btn3 = (Button) findViewById(R.id.limpar); 	
		btn4 = (Button) findViewById(R.id.apagar); 	
		btn5 = (Button) findViewById(R.id.zero); 

		final EditText ED = (EditText)findViewById(R.id.semana);

		final EditText ED2 = (EditText)findViewById(R.id.data);
		final CheckBox ED3 = (CheckBox)findViewById(R.id.ferias);
final EditText ED4= (EditText)findViewById(R.id.obra);

		final EditText ED5 = (EditText)findViewById(R.id.inicio);
		final EditText ED6= (EditText)findViewById(R.id.fim);
		
		
		
		final EditText ED7 = (EditText)findViewById(R.id.total);
		final EditText ED8= (EditText)findViewById(R.id.inicio2);
final EditText ED9= (EditText)findViewById(R.id.fim2);

		final EditText ED10 = (EditText)findViewById(R.id.total2);
		final CheckBox ED11= (CheckBox)findViewById(R.id.almoco);
		final CheckBox ED12= (CheckBox)findViewById(R.id.jantar);
		final CheckBox ED13= (CheckBox)findViewById(R.id.cupao);
		final CheckBox ED14= (CheckBox)findViewById(R.id.ajuda);
		final CheckBox ED15= (CheckBox)findViewById(R.id.ilhas);
		final EditText ED16 = (EditText)findViewById(R.id.matricula);
		final EditText ED17= (EditText)findViewById(R.id.observacao);
final CheckBox ED18= (CheckBox)findViewById(R.id.prevencao);
		btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					File f2=new File("/sdcard/app.android/horario.android.app/horario.data");
try{
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

					String s="INSERT INTO movimento (semana,data,ferias,obra,inicio,fim,horas,inicio2,fim2,horas2,almoco,jantar ,cupao,ajuda,ilha,matricula,observacoes,prevencao) VALUES ('" +ED.getText()+"' , '"+ED2.getText()+"' , '"+ED3.isChecked()+"' , '"+ED4.getText()+"' , '"+ED5.getText()+"' , '"+ED6.getText()+"' , '"+ED7.getText()+"' , '"+ED8.getText()+"' , '"+ED9.getText()+"' , '"+ED10.getText()+"' , '"+ED11.isChecked()+"' , '"+ED12.isChecked()+"' , '"+ED13.isChecked()+"' , '"+ED14.isChecked()+"' , '"+ED15.isChecked()+"' , '"+ED16.getText()+"' , '"+ED17.getText()+"' , '"+ED18.isChecked()+"')";
					setTitle(s);
					db.execSQL(s);

					db.close();
					
}catch(Exception e){
	setTitle(e.toString());
	ED18.setText(e.toString());
}

					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn1.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  



					finish(); 






				}});



		btn2.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("modificar");
					File f2=new File("/sdcard/app.android/horario.android.app/horario.data");
					ContentValues cv = new ContentValues();
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("movimento","Id<0",null);
					
					//cv.put("Id",Integer.toString(entidade));
					cv.put("semana",ED.getText().toString());
					 
					cv.put("data",ED2.getText().toString());
					cv.put("ferias",Boolean.toString(ED3.isChecked()));
					cv.put("obra",ED4.getText().toString());
					cv.put("inicio",ED5.getText().toString());
					cv.put("fim",ED6.getText().toString());
					
					
					cv.put("horas",ED7.getText().toString());
					cv.put("inicio2",ED8.getText().toString());
					cv.put("fim2",ED9.getText().toString());
					cv.put("horas2",ED10.getText().toString());
					
					cv.put("almoco",Boolean.toString(ED11.isChecked()));
					cv.put("jantar",Boolean.toString(ED12.isChecked()));
					cv.put("cupao",Boolean.toString(ED13.isChecked()));
					
					cv.put("ajuda",Boolean.toString(ED14.isChecked()));
					cv.put("ilha",Boolean.toString(ED15.isChecked()));
					cv.put("matricula",ED16.getText().toString());
					cv.put("observacoes",ED17.getText().toString());
					cv.put("prevencao",Boolean.toString(ED18.isChecked()));
					
					db.update("movimento", cv, "Id="+Integer.toString( iii), null);
					
					db.delete("movimento","Id<0",null);
					db.close();


					Intent intent = new Intent(context,Main3Activity.class);

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

					ED5.setText("");
					ED6.setText("");
					ED7.setText("");

					ED8.setText("");
					ED9.setText("");
ED10.setText("");

					ED11.setText("");
					ED12.setText("");

ED13.setText("");

					ED14.setText("");
					ED15.setText("");
ED16.setText("");

					ED17.setText("");
					ED18.setText("");


				}});



		btn4.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					
					setTitle("apagar");

					File f2=new File("/sdcard/app.android/horario.android.app/horario.data");
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("movimento","Id<0",null);
					db.delete("movimento","Id="+Integer.toString(iii),null);

					db.delete("movimento","Id<0",null);
					db.close();


					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  


					finish(); 


				}});
				
		btn5.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  



					finish(); 





				}});
				
				ED16.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED16= (EditText)findViewById(R.id.matricula);

		

		
   	try{
		int n=0;
   	   
   	  String ee=ED16.getText().toString();
		   if(ee.length()==9){
		 
		if (ee.charAt(2)=='-' && ee.charAt(5)=='-'){
			
			if (cchar(ee.charAt(0))&& cchar(ee.charAt(1)) && cchar(ee.charAt(3))&& cchar(ee.charAt(4)) && cchar(ee.charAt(6)) && cchar(ee.charAt(7))){
				setTitle("");
			}else{
				setTitle("matricula errada");
			}
			
		
		}else{
			setTitle("matricula errada");
			}
			
		setTitle("");
		  }else{
			setTitle("matricula errada");
			}
	   
       }catch(Exception e){
		  setTitle("matricula errada");
   }
   
}

   @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
				
				
				ED4.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED4= (EditText)findViewById(R.id.obra);

		
   	try{
   	   
		   
		long i= Long.parseLong( ED4.getText().toString().trim());
		if (i<21000){
			setTitle("obra menor 21000");
			}else{
				setTitle("");
				}
		  
	   
       }catch(Exception e){
		  setTitle("obra menor 21000");
   }
   
}

   @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
				
				ED2.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED = (EditText)findViewById(R.id.semana);

		final EditText ED2 = (EditText)findViewById(R.id.data);
   	try{
   	   if(s.length() != 0){
		   SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");  
		   Date currentTime = format.parse( ED2.getText().toString().replaceAll("/","-"));
		   ED.setText(getdday(currentTime.getDay()));
	   }
       }catch(Exception e){
		   ED.setText("error");
   }
   
}

   @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
ED6.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED6= (EditText)findViewById(R.id.inicio);

		final EditText ED7= (EditText)findViewById(R.id.fim);
		final EditText ED8= (EditText)findViewById(R.id.total);
   	try{
   	   if(s.length() != 0){
		   SimpleDateFormat format = new SimpleDateFormat("hh:mm");  
		   Date date2= format.parse( ED6.getText().toString());
		   Date date1= format.parse( ED7.getText().toString());
		long millis = date1.getTime() - date2.getTime();
int hours = (int) (millis / (1000 * 60 * 60));
int mins = (int) ((millis / (1000 * 60)) % 60);

String diff = hours + ":" + mins; 

	
		   ED8.setText(diff);
	   }
       }catch(Exception e){
		   ED8.setText("error");
   }
   }
      @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
  ED5.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED6= (EditText)findViewById(R.id.inicio);

		final EditText ED7= (EditText)findViewById(R.id.fim);
		final EditText ED8= (EditText)findViewById(R.id.total);
   	try{
   	   if(s.length() != 0){
		   SimpleDateFormat format = new SimpleDateFormat("hh:mm");  
		   Date date2= format.parse( ED6.getText().toString());
		   Date date1= format.parse( ED7.getText().toString());
		long millis = date1.getTime() - date2.getTime();
int hours = (int) (millis / (1000 * 60 * 60));
int mins = (int) ((millis / (1000 * 60)) % 60);

String diff = hours + ":" + mins; 

	
		   ED8.setText(diff);
	   }
       }catch(Exception e){
		   ED8.setText("error");
   }
   }
      @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
   
   ED9.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED9= (EditText)findViewById(R.id.inicio2);

		final EditText ED10= (EditText)findViewById(R.id.fim2);
		final EditText ED11= (EditText)findViewById(R.id.total2);
   	try{
   	   if(s.length() != 0){
		   SimpleDateFormat format = new SimpleDateFormat("hh:mm");  
		   Date date2= format.parse( ED9.getText().toString());
		   Date date1= format.parse( ED10.getText().toString());
		long millis = date1.getTime() - date2.getTime();
int hours = (int) (millis / (1000 * 60 * 60));
int mins = (int) ((millis / (1000 * 60)) % 60);

String diff = hours + ":" + mins; 

	
		   ED11.setText(diff);
	   }
       }catch(Exception e){
		   ED11.setText("error");
   }
   
}

      @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });
   ED8.addTextChangedListener(new TextWatcher() {

   @Override
   public void afterTextChanged(Editable s) {
   	final EditText ED9= (EditText)findViewById(R.id.inicio2);

		final EditText ED10= (EditText)findViewById(R.id.fim2);
		final EditText ED11= (EditText)findViewById(R.id.total2);
   	try{
   	   if(s.length() != 0){
		   SimpleDateFormat format = new SimpleDateFormat("hh:mm");  
		   Date date2= format.parse( ED9.getText().toString());
		   Date date1= format.parse( ED10.getText().toString());
		long millis = date1.getTime() - date2.getTime();
int hours = (int) (millis / (1000 * 60 * 60));
int mins = (int) ((millis / (1000 * 60)) % 60);

String diff = hours + ":" + mins; 


	
		   ED11.setText(diff);
	   }
       }catch(Exception e){
		   ED11.setText("error");
   }
   
}

      @Override    
   public void beforeTextChanged(CharSequence s, int start,
     int count, int after) {
   }

   @Override    
   public void onTextChanged(CharSequence s, int start,
     int before, int count) {
   }
  });

				
		File f2=new File("/sdcard/app.android/horario.android.app/horario.data");

		db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
		
		
		
		cursor = db.query("comunicacao2", new String[] { "Id","a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"},null,null,null,null,null ,null);

		if (cursor.moveToFirst()) {
funcs=cursor.getString(1).trim();
try{
	iii=Integer.parseInt(cursor.getString(1).trim());
	}catch(Exception e){
		
		
		iii=-1;
		}

setTitle(funcs);
func2=-1;
try{
	func2=funcs.indexOf("-1");
	}catch(Exception e){
		
		func2=-1;
		}
			if(func2<0){
			ED.setText( cursor.getString(2));

			ED2.setText(cursor.getString(3));
			ED3.setChecked(rets(cursor.getString(4).trim()));
			ED4.setText( cursor.getString(5));

			ED5.setText(cursor.getString(6));
			ED6.setText(cursor.getString(7));
			ED7.setText( cursor.getString(8));

			ED8.setText(cursor.getString(9));
			ED9.setText(cursor.getString(10));
			
			ED10.setText( cursor.getString(11));

			ED11.setChecked(rets(cursor.getString(12).trim()));
			ED12.setChecked(rets(cursor.getString(13).trim()));
			ED13.setChecked( rets(cursor.getString(14).trim()));

			ED14.setChecked(rets(cursor.getString(15).trim()));
			ED15.setChecked(rets(cursor.getString(16).trim()));
			ED16.setText( cursor.getString(17));

			ED17.setText(cursor.getString(18));
			ED18.setChecked(rets(cursor.getString(19).trim()));
			
			}else{
				Date currentTime = Calendar.getInstance().getTime();
				ED.setText(getdday(currentTime.getDay()));
				ED2.setText(Integer.toString(currentTime.getDate())+"/"+Integer.toString(currentTime.getMonth()+1)+"/"+Integer.toString(currentTime.getYear()+1900));
				ED5.setText(Integer.toString( currentTime.getHours())+":"+Integer.toString(currentTime.getMinutes()));
				ED6.setText(Integer.toString( currentTime.getHours())+":"+Integer.toString(currentTime.getMinutes()));
				ED8.setText(Integer.toString( currentTime.getHours())+":"+Integer.toString(currentTime.getMinutes()));
				ED9.setText(Integer.toString( currentTime.getHours())+":"+Integer.toString(currentTime.getMinutes()));
				}
			
			
			
			}
			cursor.close();
			
			db.close();

	}


}




