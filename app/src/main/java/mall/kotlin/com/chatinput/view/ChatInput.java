package mall.kotlin.com.chatinput.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import mall.kotlin.com.chatinput.R;


@SuppressLint("ViewConstructor")
public class ChatInput extends RelativeLayout implements TextWatcher {
    private Context mContext;

    public ChatInput(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public ChatInput(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    public ChatInput(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    private void init(){
        LayoutInflater.from(mContext).inflate(R.layout.chat_input, this);
        
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
