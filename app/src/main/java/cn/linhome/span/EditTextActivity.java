package cn.linhome.span;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fanwe.library.activity.SDBaseActivity;

import cn.linhome.lib.span.FImageSpan;
import cn.linhome.lib.span.view.FSpannableEditText;

/**
 * Created by Administrator on 2017/7/18.
 */

public class EditTextActivity extends SDBaseActivity
{
    private FSpannableEditText et;

    private Button btn_add, btn_remove;

    @Override
    protected void init(Bundle savedInstanceState)
    {
        setContentView(R.layout.act_edittext);
        et = (FSpannableEditText) findViewById(R.id.et);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_remove = (Button) findViewById(R.id.btn_remove);

        btn_add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FImageSpan span = new FImageSpan(getApplicationContext(), R.drawable.face);
                et.insertSpan(span, "face"); //插入span
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.removeSpan(); //删除span
            }
        });
    }
}
