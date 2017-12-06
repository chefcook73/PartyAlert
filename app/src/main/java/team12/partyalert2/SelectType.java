package team12.partyalert2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SelectType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_type);
    }

    public void selectSports(View veiw)
    {
        Intent intent = new Intent(this, SelectSport.class);
        startActivity(intent);
    }//ends login method

    public void selectStocks(View veiw)
    {
        Intent intent = new Intent(this, SelectStock.class);
        startActivity(intent);
    }//ends login method

    public void selectWeather(View veiw)
    {
        Intent intent = new Intent(this, SelectWeather.class);
        startActivity(intent);
    }//ends login method
}
