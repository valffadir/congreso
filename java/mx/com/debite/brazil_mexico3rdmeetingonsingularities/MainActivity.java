package mx.com.debite.brazil_mexico3rdmeetingonsingularities;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<Talks> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);

        /*MathView mathView = (MathView) findViewById(R.id.formula_one);
        mathView.config(
                "MathJax.Hub.Config({\n"+
                        "  CommonHTML: { linebreaks: { automatic: true } },\n"+
                        "  \"HTML-CSS\": { linebreaks: { automatic: true } },\n"+
                        "         SVG: { linebreaks: { automatic: true } }\n"+
                        "    multiline: true " +
                        "});");*/
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
//Added by me
        if(id == R.id.action_refresh){
            Toast.makeText(MainActivity.this, "Refresh App", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private List<Talks> getAllItemList(){

        List<Talks> allItems = new ArrayList<Talks>();
        allItems.add(new Talks("Maria Michalska", "Stability of relative degree", "ICMC, Universidade de Sao Paulo",
                "Let \\\\(S\\\\) be an unbounded subset of \\\\(R^n\\\\). Consider a polynomial \\\\(f\\\\). Let \\\\(\\\\deg_S f\\\\) be the smallest degree of a polynomial \\\\(h\\\\) such that \\\\(f \\\\lt h\\\\) on \\\\(S\\\\). We call such a number the degree of \\\\(f\\\\) relative to \\\\(S\\\\). Analogously, one can define a multiplicity at \\\\(0\\\\) relative to a set \\\\(S\\\\) such that \\\\(0\\\\) lies in its closure. Consider a real polynomial mapping \\\\( (g_1,\\\\dots, g_k): R^n\\\\to R^k\\\\) and its sublevel set \\\\(S_c\\\\), where \\\\(c\\\\in R^k\\\\), given by inequalities \\\\(g_1 \\\\lt c_1,\\\\dots,g_k \\\\lt c_k\\\\). We show that there exists a semialgebraic set \\\\(V_g\\\\subset R^k\\\\) of positive codimension such that if \\\\(c, C\\\\) are contained in the same connected component of \\\\(R^k\\\\setminus V_g\\\\), then the relative degrees coincide i.e. \\\\(\\\\deg_{S_c}\\\\equiv \\\\deg_{S_C}\\\\). Analogous property is true for the relative multiplicity. To prove this, we will construct an appropriate compactification of \\\\(R^n\\\\) via resolution of singularities. We will discuss the relation of \\\\(V_g\\\\) with bifurcation values at infinity of \\\\(g\\\\), the moment problems and Positivstellensaetze. This is joint work with V. Grandjean.", "Main", "09/08/2017","10:15","10:40"));
        allItems.add(new Talks("Maria Michalska", "Stability of relative degree", "ICMC, Universidade de Sao Paulo",
                "Let \\\\(S\\\\) be an unbounded subset of \\\\(R^n\\\\). Consider a polynomial \\\\(f\\\\). Let \\\\(\\\\deg_S f\\\\) be the smallest degree of a polynomial \\\\(h\\\\) such that \\\\(f \\\\lt h\\\\) on \\\\(S\\\\). We call such a number the degree of \\\\(f\\\\) relative to \\\\(S\\\\). Analogously, one can define a multiplicity at \\\\(0\\\\) relative to a set \\\\(S\\\\) such that \\\\(0\\\\) lies in its closure. Consider a real polynomial mapping \\\\( (g_1,\\\\dots, g_k): R^n\\\\to R^k\\\\) and its sublevel set \\\\(S_c\\\\), where \\\\(c\\\\in R^k\\\\), given by inequalities \\\\(g_1 \\\\lt c_1,\\\\dots,g_k \\\\lt c_k\\\\). We show that there exists a semialgebraic set \\\\(V_g\\\\subset R^k\\\\) of positive codimension such that if \\\\(c, C\\\\) are contained in the same connected component of \\\\(R^k\\\\setminus V_g\\\\), then the relative degrees coincide i.e. \\\\(\\\\deg_{S_c}\\\\equiv \\\\deg_{S_C}\\\\). Analogous property is true for the relative multiplicity. To prove this, we will construct an appropriate compactification of \\\\(R^n\\\\) via resolution of singularities. We will discuss the relation of \\\\(V_g\\\\) with bifurcation values at infinity of \\\\(g\\\\), the moment problems and Positivstellensaetze. This is joint work with V. Grandjean.", "Invited", "09/08/2017","10:15","10:40"));
        allItems.add(new Talks("Maria Michalska", "Stability of relative degree", "ICMC, Universidade de Sao Paulo",
                "Let \\\\(S\\\\) be an unbounded subset of \\\\(R^n\\\\). Consider a polynomial \\\\(f\\\\). Let \\\\(\\\\deg_S f\\\\) be the smallest degree of a polynomial \\\\(h\\\\) such that \\\\(f \\\\lt h\\\\) on \\\\(S\\\\). We call such a number the degree of \\\\(f\\\\) relative to \\\\(S\\\\). Analogously, one can define a multiplicity at \\\\(0\\\\) relative to a set \\\\(S\\\\) such that \\\\(0\\\\) lies in its closure. Consider a real polynomial mapping \\\\( (g_1,\\\\dots, g_k): R^n\\\\to R^k\\\\) and its sublevel set \\\\(S_c\\\\), where \\\\(c\\\\in R^k\\\\), given by inequalities \\\\(g_1 \\\\lt c_1,\\\\dots,g_k \\\\lt c_k\\\\). We show that there exists a semialgebraic set \\\\(V_g\\\\subset R^k\\\\) of positive codimension such that if \\\\(c, C\\\\) are contained in the same connected component of \\\\(R^k\\\\setminus V_g\\\\), then the relative degrees coincide i.e. \\\\(\\\\deg_{S_c}\\\\equiv \\\\deg_{S_C}\\\\). Analogous property is true for the relative multiplicity. To prove this, we will construct an appropriate compactification of \\\\(R^n\\\\) via resolution of singularities. We will discuss the relation of \\\\(V_g\\\\) with bifurcation values at infinity of \\\\(g\\\\), the moment problems and Positivstellensaetze. This is joint work with V. Grandjean.", "Main", "09/08/2017","10:15","10:40"));
        allItems.add(new Talks("Maria Michalska", "Stability of relative degree", "ICMC, Universidade de Sao Paulo",
                "Let \\\\(S\\\\) be an unbounded subset of \\\\(R^n\\\\). Consider a polynomial \\\\(f\\\\). Let \\\\(\\\\deg_S f\\\\) be the smallest degree of a polynomial \\\\(h\\\\) such that \\\\(f \\\\lt h\\\\) on \\\\(S\\\\). We call such a number the degree of \\\\(f\\\\) relative to \\\\(S\\\\). Analogously, one can define a multiplicity at \\\\(0\\\\) relative to a set \\\\(S\\\\) such that \\\\(0\\\\) lies in its closure. Consider a real polynomial mapping \\\\( (g_1,\\\\dots, g_k): R^n\\\\to R^k\\\\) and its sublevel set \\\\(S_c\\\\), where \\\\(c\\\\in R^k\\\\), given by inequalities \\\\(g_1 \\\\lt c_1,\\\\dots,g_k \\\\lt c_k\\\\). We show that there exists a semialgebraic set \\\\(V_g\\\\subset R^k\\\\) of positive codimension such that if \\\\(c, C\\\\) are contained in the same connected component of \\\\(R^k\\\\setminus V_g\\\\), then the relative degrees coincide i.e. \\\\(\\\\deg_{S_c}\\\\equiv \\\\deg_{S_C}\\\\). Analogous property is true for the relative multiplicity. To prove this, we will construct an appropriate compactification of \\\\(R^n\\\\) via resolution of singularities. We will discuss the relation of \\\\(V_g\\\\) with bifurcation values at infinity of \\\\(g\\\\), the moment problems and Positivstellensaetze. This is joint work with V. Grandjean.", "Main", "09/08/2017","10:15","10:40"));
        allItems.add(new Talks("Maria Michalska", "Stability of relative degree", "ICMC, Universidade de Sao Paulo",
                "Let \\\\(S\\\\) be an unbounded subset of \\\\(R^n\\\\). Consider a polynomial \\\\(f\\\\). Let \\\\(\\\\deg_S f\\\\) be the smallest degree of a polynomial \\\\(h\\\\) such that \\\\(f \\\\lt h\\\\) on \\\\(S\\\\). We call such a number the degree of \\\\(f\\\\) relative to \\\\(S\\\\). Analogously, one can define a multiplicity at \\\\(0\\\\) relative to a set \\\\(S\\\\) such that \\\\(0\\\\) lies in its closure. Consider a real polynomial mapping \\\\( (g_1,\\\\dots, g_k): R^n\\\\to R^k\\\\) and its sublevel set \\\\(S_c\\\\), where \\\\(c\\\\in R^k\\\\), given by inequalities \\\\(g_1 \\\\lt c_1,\\\\dots,g_k \\\\lt c_k\\\\). We show that there exists a semialgebraic set \\\\(V_g\\\\subset R^k\\\\) of positive codimension such that if \\\\(c, C\\\\) are contained in the same connected component of \\\\(R^k\\\\setminus V_g\\\\), then the relative degrees coincide i.e. \\\\(\\\\deg_{S_c}\\\\equiv \\\\deg_{S_C}\\\\). Analogous property is true for the relative multiplicity. To prove this, we will construct an appropriate compactification of \\\\(R^n\\\\) via resolution of singularities. We will discuss the relation of \\\\(V_g\\\\) with bifurcation values at infinity of \\\\(g\\\\), the moment problems and Positivstellensaetze. This is joint work with V. Grandjean.", "Invited", "09/08/2017","10:15","10:40"));

        /*
        allItems.add(new Talks("Henry Jacobs", "3 Villa Crescent London, UK", R.mipmap.ic_talk));
        allItems.add(new Talks("Bola Olumide", "Victoria Island Lagos, Nigeria", R.mipmap.ic_talk));
        allItems.add(new Talks("Chidi Johnson", "New Heaven Enugu, Nigeria", R.mipmap.ic_invitedtalk));
        allItems.add(new Talks("DeGordio Puritio", "Italion Gata, Padova, Italy", R.mipmap.ic_talk));
        allItems.add(new Talks("Gary Cook", "San Fransisco, United States", R.mipmap.ic_invitedtalk));
        allItems.add(new Talks("Edith Helen", "Queens Crescent, New Zealand", R.mipmap.ic_talk));
        allItems.add(new Talks("Kingston Dude", "Ivory Lane, Abuja, Nigeria", R.mipmap.ic_invitedtalk));
        allItems.add(new Talks("Edwin Bent", "Johnson Road, Port Harcourt, Nigeria", R.mipmap.ic_invitedtalk));
        allItems.add(new Talks("Grace Praise", "Federal Quarters, Abuja Nigeria", R.mipmap.ic_talk));
*/
        return allItems;
    }
}
