package com.example.assign09;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    private Button bookTicket,showTickets,cancelTicket;
    private EditText seatNumber,showTiming,showName,bookingInNameOf;
    private TextView listTickets;
    private main2Activity movieTicketCrudOperation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookTicket=findViewById(R.id.bookTicket);
        showTickets=findViewById(R.id.showTickets);
        cancelTicket=findViewById(R.id.cancetTicket);
        seatNumber=findViewById(R.id.seatNumber);
        showTiming=findViewById(R.id.showTime);
        showName=findViewById(R.id.showName);
        bookingInNameOf=findViewById(R.id.bookinginnameof);
        listTickets=findViewById(R.id.listTickets);
        movieTicketCrudOperation=new main2Activity(this,"",null,1);
        operation();
    }
    public void operation()
    {
        bookTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    movieTicketCrudOperation.bookTicket(seatNumber.getText().toString(),bookingInNameOf.getText().toString(),showTiming.getText().toString(),showName.getText().toString());
                }
                catch(SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });
        showTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    movieTicketCrudOperation.listTickets(listTickets);
                }
                catch(SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });
        cancelTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    movieTicketCrudOperation.cancelTicket(seatNumber.getText().toString());
                }
                catch(SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
