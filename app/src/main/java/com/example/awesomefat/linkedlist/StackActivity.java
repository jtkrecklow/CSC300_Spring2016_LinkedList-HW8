package com.example.awesomefat.linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class StackActivity extends AppCompatActivity
{
    int count = 0;
    private Button push;
    private Button pop;
    private Button peek;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        this.push = (Button)this.findViewById(R.id.pushButton);
        this.pop = (Button)this.findViewById(R.id.popButton);
        this.peek = (Button)this.findViewById(R.id.peekButton);

        ListCore.newValueEditText = (EditText)this.findViewById(R.id.newStackET);

        ListCore.inflater = this.getLayoutInflater();

        LinearLayout stLL = (LinearLayout)this.findViewById(R.id.stackViewLL);

        ListCore.ll = new LinkedList(stLL);

        ListCore.ll.addFront("2");
        ListCore.ll.addFront("3");
        ListCore.ll.display();




        this.count++;
    }

    @Override
    protected void onResume()
    {
        super.onResume();


        this.count++;
    }

    public void buttonClicked(View sender)
    {
        if(sender == peek)
        {
            ListCore.ll.getAtIndex(0);
            ListCore.ll.display();
        }
        else if(sender == push)
        {
            ListCore.ll.addFront(String.valueOf(this.findViewById(R.id.newStackET)));

        }
        else if (sender == pop)
        {
            ListCore.ll.removeFront();
        }
        ListCore.ll.display();

    }
}
