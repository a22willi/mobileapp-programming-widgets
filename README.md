
# Assignment 3

**Widgets**

- Det första som gjordes var att flytta på den redan existerande texten till en mer passande position.
- Därefter lades en knapp till med målet att kunna ändra på texten varje gång denna klickas på. 
- Jag genomförde ovan genom att första hitta knappen och texten via 'findViewById', därefter lades en onclicklistener till på knappen:
```
Button button = findViewById(R.id.button);
final TextView text = findViewById(R.id.text);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        ButtonPushedTimes++;
        text.setText("Button pressed: " + ButtonPushedTimes + " times");
    }
});
```
- Varpå knappen klickas på körs koden: "ButtonPushedTimes++;" samt "text.setText" vilket ökar räknaren och därefter visar resultatet av detta i textViewn. Detta kan se ut såhär:
![](image_button_counter.png)
- Därpå lades en switch samt en bild till i Layouten. med målet att kunna dölja bilden när man justerar switchen. 
- För att uppnå detta sattes bilden till en source genom följande kod: ```imgview.setImageResource(R.drawable.android_logo);```
- För att sedan kunna dölja bilden genom switchen sattes en listener på switchen. För att sedan Dölja/visa kollar jag om dens nuvarande status och sätter den till motsatt status varje gång knappen skickar ett event genom koden nedan.
```
sw1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (imgview.getVisibility() == View.VISIBLE) {
            imgview.setVisibility(View.INVISIBLE);
        } else {
            imgview.setVisibility(View.VISIBLE);
        }
    }
});
```

**Såhär ser slutresultatet ut:**
![](image_resultat.png)