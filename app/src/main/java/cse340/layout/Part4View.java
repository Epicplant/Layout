package cse340.layout;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;

/**
 * This view should imitate an interface you've seen before and like. If you need ideas
 * about what to imitate, check out this repository: http://interactionmining.org/rico
 */
public class Part4View extends ConstraintLayout {

    public Part4View(Context context, int vMargin) {
        super(context);

        LayoutInflater inflater = LayoutInflater.from(context);
        android.view.View parentLayout = inflater.inflate(R.layout.part4, this, false);//child.xml
        addView(parentLayout);

        android.widget.RelativeLayout topNav = (android.widget.RelativeLayout) findViewById(R.id.topNav);
        android.widget.RelativeLayout bottomNav = (android.widget.RelativeLayout) findViewById(R.id.bottomNav);
        android.widget.RelativeLayout searchBar = (android.widget.RelativeLayout) findViewById(R.id.searchBar);
        android.widget.ScrollView scroller = (android.widget.ScrollView) findViewById(R.id.mainScroll);
        android.widget.LinearLayout linear = (android.widget.LinearLayout) findViewById(R.id.textScreen);

        topNav.setBackgroundColor(Color.rgb(35, 39, 42));
        bottomNav.setBackgroundColor(Color.rgb(44,47,51));
        searchBar.setBackgroundColor(Color.rgb(35, 39, 42));
        linear.setBackgroundColor(Color.rgb(44,47,51));
        scroller.setBackgroundColor(Color.rgb(44,47,51));

        android.widget.ImageView imgOne = new android.widget.ImageView(context);
        imgOne.setImageResource(R.drawable.token_1);

        android.widget.ImageView imgTwo = new android.widget.ImageView(context);
        imgTwo.setImageResource(R.drawable.token_2);

        android.widget.ImageView imgThree = new android.widget.ImageView(context);
        imgThree.setImageResource(R.drawable.token_3);

        android.widget.ImageView imgFour = new android.widget.ImageView(context);
        imgFour.setImageResource(R.drawable.token_4);

        android.widget.ImageView imgFive = new android.widget.ImageView(context);
        imgFive.setImageResource(R.drawable.token_5);

        android.widget.ImageView imgSix = new android.widget.ImageView(context);
        imgSix.setImageResource(R.drawable.token_6);

        android.widget.ImageView imgSeven = new android.widget.ImageView(context);
        imgSeven.setImageResource(R.drawable.token_7);

        android.widget.ImageView imgEight = new android.widget.ImageView(context);
        imgEight.setImageResource(R.drawable.token_8);

        android.widget.ImageView imgNine = new android.widget.ImageView(context);
        imgNine.setImageResource(R.drawable.token_9);

        addProfile(imgOne, "Kayla'sProfile", "April 10, 2017 6:30 AM", "Hello I am Kayla!", context);
        addProfile(imgTwo, "Tommy'sProfile", "April 10, 2017 6:32 AM", "Hello I am Tommy!", context);
        addProfile(imgThree, "Epicplantofdoom", "April 10, 2017 6:34 AM", "The name's Epic, don't wear it out!", context);
        addProfile(imgFour, "David065", "April 10, 2017 6:36 AM", "Nice to meet all of you!", context);
        addProfile(imgFive, "Timothy", "April 10, 2017 6:38 AM", "What's up my peeps!", context);
        addProfile(imgSix, "Samuel6969", "April 10, 2017 6:40 AM", "Huh, never been on Discord before", context);
        addProfile(imgSeven, "God", "April 10, 2017 6:42 AM", "I endorse this server", context);
        addProfile(imgEight, "WeirdBoi", "April 10, 2017 6:44 AM", "This is a test to show that messages can reach two lines! " +
                "It is a pleasure to meet you, dear reader, and I hope you are having a fantastic day when you read this message. " +
                "Anyways, I'll let you get back to your task. Take care!", context);
        // TODO: Build your desired layout for part 4. Make use of a combination of XML and
        //  programmatic techniques to accomplish this.

        // Note: We provide you with our vMargin, but you may create your own.
        // Remember to use the XML resource file to store your dimensions.

        // To use MainActivity#getImages() you can use this line of code:
        // ((MainActivity) context).getImages("<CSV_NAME_HERE>");

    }

    public void addProfile(android.widget.ImageView profileImage, String profileNameText, String dateText,
                           String messageText, Context context) {

        profileImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        profileImage.setAdjustViewBounds(true);

        android.widget.TextView dateLine = new android.widget.TextView(context);
        dateLine.setText(profileNameText);
        dateLine.setTextColor(Color.GRAY);

        ConstraintLayout msgPost = new ConstraintLayout(context);
        msgPost.setBackgroundColor(Color.rgb(44,47,51));

        android.widget.TextView profileName = new android.widget.TextView(context);
        profileName.setText(profileNameText);
        profileName.setTextColor(Color.WHITE);
        profileName.setTextSize(18);

        android.widget.TextView date = new android.widget.TextView(context);
        date.setText(dateText);
        date.setTextColor(Color.GRAY);
        date.setTextSize(11);

        android.widget.TextView message = new android.widget.TextView(context);
        message.setText(messageText);
        message.setTextColor(Color.WHITE);
        message.setTextSize(12);

        profileImage.setAdjustViewBounds(true);

        ConstraintLayout.LayoutParams msgPostParams = new ConstraintLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT);
        msgPostParams.leftToLeft = R.id.textScreen;
        msgPostParams.rightToRight = R.id.textScreen;

        msgPost.setId(0);
        profileImage.setId((int) 1);
        message.setId((int) 2);
        date.setId((int) 3);
        profileName.setId((int) 4);

        ConstraintLayout.LayoutParams profileImageParams = new ConstraintLayout.LayoutParams(100, 100);
        profileImageParams.leftToLeft = msgPost.getId();
        profileImageParams.topToTop = msgPost.getId();
        profileImageParams.bottomToBottom = msgPost.getId();
        profileImageParams.leftMargin = 50;

        ConstraintLayout.LayoutParams profileNameParams = new
                ConstraintLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        profileNameParams.leftToRight = profileImage.getId();
        profileNameParams.topToTop = msgPost.getId();
        profileNameParams.bottomToTop = message.getId();
        profileNameParams.rightToLeft = date.getId();
        profileNameParams.bottomMargin = 20;
        profileNameParams.leftMargin = 50;
        profileNameParams.rightMargin = 20;

        ConstraintLayout.LayoutParams dateParams = new ConstraintLayout.LayoutParams(LayoutParams.MATCH_PARENT/2,
                LayoutParams.WRAP_CONTENT);
        dateParams.rightToRight = msgPost.getId();
        dateParams.topToTop = msgPost.getId();
        dateParams.bottomToTop = message.getId();
        dateParams.leftToRight = profileName.getId();
        dateParams.bottomMargin = 20;
        dateParams.rightMargin = 20;
        dateParams.leftMargin = 10;

        ConstraintLayout.LayoutParams messageParams = new ConstraintLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT);
        messageParams.bottomToBottom = msgPost.getId();
        messageParams.rightToRight = msgPost.getId();
        messageParams.bottomMargin = 50;
        messageParams.leftMargin = 200;

        profileName.setText(profileNameText);
        date.setText(dateText);
        message.setText(messageText);

        msgPost.addView(profileImage, profileImageParams);
        msgPost.addView(profileName, profileNameParams);
        msgPost.addView(date, dateParams);
        msgPost.addView(message, messageParams);

        LinearLayout mainScreen = (LinearLayout) findViewById(R.id.textScreen);
        mainScreen.addView(msgPost, msgPostParams);

    }

}
