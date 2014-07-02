package i2p.bote.android.addressbook;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import i2p.bote.android.InitActivities;

public class EditContactActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize I2P settings
        InitActivities init = new InitActivities(this);
        init.initialize();

        // Enable ActionBar app icon to behave as action to go back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            String destination = null;
            Bundle args = getIntent().getExtras();
            if (args != null)
                destination = args.getString(EditContactFragment.CONTACT_DESTINATION);
            EditContactFragment f = EditContactFragment.newInstance(destination);
            getSupportFragmentManager().beginTransaction()
                .add(android.R.id.content, f).commit();
        }
    }
}
