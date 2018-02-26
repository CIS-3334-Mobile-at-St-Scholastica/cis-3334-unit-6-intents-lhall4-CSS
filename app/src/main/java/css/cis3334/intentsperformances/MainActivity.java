package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//Initialize buttons and textView
    Button btn1Web, but1Calendar, btn1Map;
    Button btn2Web, but2Calendar, btn2Map;
    Button btn3Web, but3Calendar, btn3Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();



    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        //Set Related Elements
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn2Web = (Button) findViewById(R.id.button2WebInfo);
        btn3Web = (Button) findViewById(R.id.button3WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display website for performance 1");
                //Set web url
                Uri webpage = Uri.parse("http://www.android.com");
                //Create new web intent
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if(isIntentSafe == true) {
                    startActivity(webIntent);
                }
            }
        });
        btn2Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display website for performance 2");
                //Set web url
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d124648615%26view%3devent%26-childview%3d");
                //Create new web intent
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if(isIntentSafe == true) {
                    startActivity(webIntent);
                }
            }
        });
        btn3Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display website for performance 3");
                //Set web url
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d124772591%26view%3devent%26-childview%3d");
                //Create new web intent
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if(isIntentSafe == true) {
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        //Set Related Elements
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but2Calendar = (Button) findViewById(R.id.button2Calendar);
        but3Calendar = (Button) findViewById(R.id.button3Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                // Do something in response to button click
                                                //set text
                                                textViewStatus.setText("Code should set a calendar event for performance 1");
                                                //create new calendar intent
                                                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                                                calIntent.setType("vnd.android.cursor.item/event");
                                                //set date & time
                                                calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
                                                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
                                                GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 3, 40);
                                                GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 4, 40);
                                                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                                        begDate.getTimeInMillis());
                                                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                                        endDate.getTimeInMillis());
                                                //Check for app to handle intent
                                                PackageManager packageManager = getPackageManager();
                                                List activities = packageManager.queryIntentActivities(calIntent,
                                                        PackageManager.MATCH_DEFAULT_ONLY);
                                                boolean isIntentSafe = activities.size() > 0;
                                                if (isIntentSafe == true) {
                                                    startActivity(calIntent);
                                                }
                                            }
                                        });

                but2Calendar.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View v) {
                                                        // Do something in response to button click
                                                        //set text
                                                        textViewStatus.setText("Code should set a calendar event for performance 2");
                                                        Intent calIntent = new Intent(Intent.ACTION_INSERT);
                                                        calIntent.setType("vnd.android.cursor.item/event");
                                                        calIntent.putExtra(CalendarContract.Events.TITLE, "Celebrate Spring");
                                                        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
                                                        GregorianCalendar begDate = new GregorianCalendar(2018, 3, 8, 7, 30);
                                                        GregorianCalendar endDate = new GregorianCalendar(2018, 3, 8, 9, 30);
                                                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                                                begDate.getTimeInMillis());
                                                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                                                endDate.getTimeInMillis());
                                                        //Check for app to handle intent
                                                        PackageManager packageManager = getPackageManager();
                                                        List activities = packageManager.queryIntentActivities(calIntent,
                                                                PackageManager.MATCH_DEFAULT_ONLY);
                                                        boolean isIntentSafe = activities.size() > 0;
                                                        if (isIntentSafe == true) {
                                                            startActivity(calIntent);
                                                        }
                                                    }
                                                });
                        but3Calendar.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                // Do something in response to button click
                                //set text
                                textViewStatus.setText("Code should set a calendar event for performance 3");
                                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                                calIntent.setType("vnd.android.cursor.item/event");
                                calIntent.putExtra(CalendarContract.Events.TITLE, "Celebrate Spring");
                                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                                GregorianCalendar begDate = new GregorianCalendar(2018, 4, 13, 7, 30);
                                GregorianCalendar endDate = new GregorianCalendar(2018, 4, 13, 9, 30);
                                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                        begDate.getTimeInMillis());
                                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                        endDate.getTimeInMillis());
                                //Check for app to handle intent
                                PackageManager packageManager = getPackageManager();
                                List activities = packageManager.queryIntentActivities(calIntent,
                                        PackageManager.MATCH_DEFAULT_ONLY);
                                boolean isIntentSafe = activities.size() > 0;
                                if (isIntentSafe == true) {
                                    startActivity(calIntent);
                                }
                            }
                        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        //Set Related Elements
        btn1Map = (Button) findViewById(R.id.button1map);
        btn2Map = (Button) findViewById(R.id.button2map);
        btn3Map = (Button) findViewById(R.id.button3map);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display map for performance 1");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if (isIntentSafe == true) {
                    startActivity(mapIntent);
                }
            }
        });
        btn2Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display map for performance 2");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if (isIntentSafe == true) {
                    startActivity(mapIntent);
                }
            }
        });
        btn3Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //set text
                textViewStatus.setText("Code should display map for performance 3");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //Check for app to handle intent
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                if (isIntentSafe == true) {
                    startActivity(mapIntent);
                }
            }
        });

    }


}
