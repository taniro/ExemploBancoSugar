package tads.eaj.com.exemplobancosugar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.orm.SugarContext;

import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SugarContext.init(this);

        Carro corsa = new Carro(2000, "Corsa", "Hatch", "Carro Corsa");
        Carro palio = new Carro(2016, "Palio", "Hatch", "Carro Palio");
        Carro hbvinte = new Carro(2014, "HB20", "Sedan", "Carro HB20");
        Carro tuckson = new Carro(2015, "Tuckson", "Sedan", "Carro Tuckson");
        Carro corsa2 = new Carro(2015, "Corsa", "Hatch", "Carro Corsa 2");

        corsa.save(corsa);
        palio.save(palio);
        hbvinte.save(hbvinte);
        tuckson.save(tuckson);
        corsa2.save(corsa2);

        Carro c = Carro.findById(Carro.class, 1);
        Log.i("SQL", c.toString());

        c.desc = "Nova descrição";
        c.save();

        c = Carro.findById(Carro.class, 2);
        c.delete();

        List<Carro> carros = Carro.listAll(Carro.class);

        for (Carro c1 : carros){
            Log.i("SQL", c1.toString());
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SugarContext.terminate();
    }
}
