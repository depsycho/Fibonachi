package lt.vtvpmc.ems.fibonachi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = (TextView)findViewById(R.id.textViewResult);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int element = Integer.parseInt(editText.getText().toString());
            long fibonacci = (long) fibonacci(element);
            textViewResult.setText(String.valueOf(fibonacci));
        }

        public long fibonacci(long n) {
            long prev = 0L; long next = 1L; long result = 0L;
            if(n == 0){
                return 0;
            } else if(n == 1) {
                return 1;
            } else {

               for(int i = 1; i < n; i++) {
                   result = prev + next;
                   prev = next;
                   next = result;
               }
               return result;
            }

        }
    });

    }
}
