package com.example.moviles;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class editarInformacionPersonal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_informacion_personal);

        // Crear un HashMap con los intereses y sus categorías
        HashMap<String, String> intereses = new HashMap<String, String>();
        intereses.put("Abseling (Rappelling)", "Extreme");
        intereses.put("Acrobatics", "Sports");
        intereses.put("Acroyoga", "Sports");
        intereses.put("Acting", "Performing Arts");
        intereses.put("Aeromodelling", "Arts & Crafts");
        intereses.put("Airbrushing", "Arts & Crafts");
        intereses.put("Aircraft Spotting", "Outdoors");
        intereses.put("Airplane Combat", "Extreme");
        intereses.put("Airplane Flight", "Extreme");
        intereses.put("Airsofting", "Outdoors");
        intereses.put("Alligator Wrestling", "Extreme");
        intereses.put("Amateur Astronomy", "Outdoors");
        intereses.put("Amateur Radio", "High Tech");
        intereses.put("Animals/pets/dogs", "Pets");
        intereses.put("Ant Farm", "Pets");
        intereses.put("Aquarium (Freshwater & Saltwater)", "Pets");
        intereses.put("Archery", "Sports");
        intereses.put("Arts", "Arts & Crafts");
        intereses.put("Astrology", "Intellectual");
        intereses.put("Astronomy", "Outdoors");
        intereses.put("Backgammon", "Games");
        intereses.put("Badminton", "Sports");
        intereses.put("Barefooting", "Extreme");
        intereses.put("Base Jumping", "Extreme");
        intereses.put("Baseball", "Sports");
        intereses.put("Basketball", "Sports");
        intereses.put("Beach/Sun tanning", "Outdoors");
        intereses.put("Beachcombing", "Outdoors");
        intereses.put("Beadwork", "Arts & Crafts");
        intereses.put("Beatboxing", "Music");
        intereses.put("Becoming A Child Advocate", "Philantropy");
        intereses.put("Bell Ringing", "Music");
        intereses.put("Belly Dancing", "Dancing");
        intereses.put("Bicycle Polo", "Sports");
        intereses.put("Bird watching", "Outdoors");
        intereses.put("Birding", "Outdoors");
        intereses.put("Blacksmithing", "Arts & Crafts");
        intereses.put("Blobbing", "Extreme");
        intereses.put("Blogging", "High Tech");
        intereses.put("BMX", "Extreme");
        intereses.put("Board Games", "Games");
        intereses.put("Boating", "Outdoors");
        intereses.put("Bobsledding", "Extreme");
        intereses.put("Body Building", "Sports");
        intereses.put("Bonsai Tree", "Outdoors");
        intereses.put("Bookbinding", "Arts & Crafts");
        intereses.put("Boomerangs", "Outdoors");
        intereses.put("Bowling", "Sports");
        intereses.put("Boxing", "Sports");
        intereses.put("Brewing Beer", "Food & Drink");
        intereses.put("Bridge Building", "Arts & Crafts");
        intereses.put("Bringing Food To The Disabled", "Philantropy");
        intereses.put("Building A House For Habitat For Humanity", "Philantropy");
        intereses.put("Building Dollhouses", "Arts & Crafts");
        intereses.put("Bungee Jumping", "Extreme");
        intereses.put("Butterfly Watching","Outdoors");
        intereses.put("Button Collegting","Collecting");
        intereses.put("Cake Decorating","Food & Drink");
        intereses.put("Calligraphy","Arts & Crafts");
        intereses.put("Camping","Outdoors");
        intereses.put("Candle Making","Arts & Crafts");
        intereses.put("Canoeing","Outdoors");
        intereses.put("Canyon Swinging","Extreme");
        intereses.put("Car Racing","Extreme");
        intereses.put("Cardio Workout","Sports");
        intereses.put("Cardstacking","Arts & Crafts");
        intereses.put("Cartooning","Arts & Crafts");
        intereses.put("Casino Gambling","Games");
        intereses.put("Cave Diving","Outdoors");
        intereses.put("Ceramics","Arts & Crafts");
        intereses.put("Cheerleading","Sports");
        intereses.put("Chess","Games");
        intereses.put("Church/church activities","Intellectual");
        intereses.put("Cigar Smoking","Food & Drink");
        intereses.put("Cliff Diving","Extreme");
        intereses.put("Cloud Watching","Outdoors");
        intereses.put("Coin Collecting","Collecting");
        intereses.put("Collecting Antiques","Collecting");
        intereses.put("Collecting","Collecting");
        intereses.put("Collecting Artwork","Collecting");
        intereses.put("Collecting Hats","Collecting");
        intereses.put("Collecting Music Albums","Collecting");
        intereses.put("Collecting RPM Records","Collecting");
        intereses.put("Collecting Sports Cards","Collecting");
        intereses.put("Collecting Swords","Collecting");
        intereses.put("Coloring","Arts & Crafts");
        intereses.put("Compose Music","Music");
        intereses.put("Computera Activities","High Tech");
        intereses.put("Contact Juggling","Outdoors");
        intereses.put("Conworlding","Arts & Crafts");
        intereses.put("Cooking","Food & Drink");
        intereses.put("Cosplay","Games");
        intereses.put("Crafts","Arts & Crafts");
        intereses.put("Crochet","Arts & Crafts");
        intereses.put("Crocheting","Arts & Crafts");
        intereses.put("Cross-Stitch","Arts & Crafts");
        intereses.put("Crossword Puzzles","Games");
        intereses.put("Cycling","Sports");
        intereses.put("Dancing","Dancing");
        intereses.put("Darts","Games");
        intereses.put("Diecast Collectibles","Collecting");
        intereses.put("Digital Photography","Arts & Crafts");
        intereses.put("Diving","Sports");
        intereses.put("Dodgeball","Sports");
        intereses.put("Dolls","Collecting");
        intereses.put("Dominoes","Games");
        intereses.put("Downhill Mountain Biking","Extreme");
        intereses.put("Downhill Skateboarding","Extreme");
        intereses.put("Drawing","Arts & Crafts");
        intereses.put("Dumpster Diving","Outdors");
        intereses.put("Eating out","Food & Drink");
        intereses.put("Educational Courses","Educational");
        intereses.put("Electronics","High Tech");
        intereses.put("Embroidery","Arts & Crafts");
        intereses.put("Entrataining","Food & Drink");
        intereses.put("Exercise","Sports");
        intereses.put("Falconry","Outdoors");
        intereses.put("Fast Cars","Outdoors");
        intereses.put("Felting","Arts & Crafts");
        intereses.put("Fencing","Sports");
        intereses.put("Fire Poi","Performing Arts");
        intereses.put("FloorBall","Sports");
        intereses.put("Floral Arrangements","Arts & Crafts");
        intereses.put("Flowboarding","Extreme");
        intereses.put("Fly Fishing","Outdoors");
        intereses.put("Fly Hunting","Sports");
        intereses.put("Fly Tying","Outdoors");
        intereses.put("Football","Sports");
        intereses.put("Four Wheeling","Outdoors");
        intereses.put("Free Climbing","Extreme");
        intereses.put("Freshwater Aquariums","Pets");
        intereses.put("Frisbee Golf","Sport");
        intereses.put("Games","Games");
        intereses.put("Garage Saleing","Outdoors");
        intereses.put("Gardering","Outdoors");
        intereses.put("Genealogy","Educational");
        intereses.put("Geocaching","Outdoors");
        intereses.put("Ghost Hunting","Outdoors");
        intereses.put("Glowsticking","Performing Arts");
        intereses.put("Gnoming","Outdoors");
        intereses.put("Go Kart Racing","Extreme");
        intereses.put("Going to movies","Performing Arts");
        intereses.put("Golf","Sports");
        intereses.put("Grip Strength","Outdoors");
        intereses.put("Guitar","Music");
        intereses.put("Gun Collecting","Collecting");
        intereses.put("Gunsmithing","Arts & Crafts");
        intereses.put("Gymnastics","Sports");
        intereses.put("Gyotaku","Arts & Crafts");
        intereses.put("Handwriting Analysis","Educational");
        intereses.put("Herping","Pets");
        intereses.put("Highlining","Extreme");
        intereses.put("Hiking","Outdoors");
        intereses.put("Home Brewing","Food & Drink");
        intereses.put("Home Repair","Educational");
        intereses.put("Home Theater","High Tech");
        intereses.put("Horseback Riding","Sports");
        intereses.put("Hot air ballooning","Outdoors");
        intereses.put("Hula Hooping","Outdoors");
        intereses.put("Hunting","Outdoors");
        intereses.put("Ice Climbing","Extreme");
        intereses.put("Ice Cross Downhill","Extreme");
        intereses.put("Ice Diving","Extreme");
        intereses.put("Ice Fishing","Outdoors");
        intereses.put("Illusion","Performing Arts");
        intereses.put("Impersonations","Performing Arts");
        intereses.put("Inline Skating","Sports");
        intereses.put("Internet","High Tech");
        intereses.put("Inventing","Educational");
        intereses.put("Jet Engines","Arts & Crafts");
        intereses.put("Jetboarding","Extreme");
        intereses.put("Jewelry Making","Arts & Crafts");
        intereses.put("Jigsaw Puzzles","Game");
        intereses.put("Jousting","Extreme");
        intereses.put("Juggling","Outdoors");
        intereses.put("Jump Roping","Outdoors");
        intereses.put("Kayaking","Outdoors");
        intereses.put("Keep A Journal","Arts & Crafts");
        intereses.put("Kitchen Chemistry","Educational");
        intereses.put("Kite Boarding","Extreme");
        intereses.put("Kites","Outdoors");
        intereses.put("Knitting","Arts & Crafts");
        intereses.put("Knotting","Arts & Crafts");
        intereses.put("Lacrosse","Sports");
        intereses.put("Lasers","Educational");
        intereses.put("Lawn Darts","Games");
        intereses.put("Learn to play Poker","Games");
        intereses.put("Learning a Foreign Language","Educational");
        intereses.put("Learning an Instrument","Music");
        intereses.put("Learning to pilot a plane","Educational");
        intereses.put("Leathercrafting","Arts & Crafts");
        intereses.put("Legos","Games");
        intereses.put("Letterboxing","Outdoors");
        intereses.put("Listening to music","Music");
        intereses.put("Locksport","Sports");
        intereses.put("Luge / Skeleton","Extreme");
        intereses.put("Macramé","Arts & Crafts");
        intereses.put("Magic","Performing Arts");
        intereses.put("Making Model Cars","Arts & Crafts");
        intereses.put("Marksmanship","Outdoors");
        intereses.put("Martial Arts","Sports");
        intereses.put("Matchstick Modeling","ARts & Crafts");
        intereses.put("Meditation","Intellectual");
        intereses.put("Metal Detecting","Outdoors");
        intereses.put("Microscopy","Intellectual");
        intereses.put("Model Railroading","Arts & Crafts");
        intereses.put("Model Ships ","Arts & Crafts");
        intereses.put("Models","Arts  & Crafts");
        intereses.put("Motocross","Extreme");
        intereses.put("Motorcycle Stunts","Extreme");
        intereses.put("Motorcycles","Extreme");
        intereses.put("Mountain Biking","Outdoors");
        intereses.put("Mountain Boarding","Extreme");
        intereses.put("Mountain Climbing","Outdoors");
        intereses.put("Musical Instruments","Music");
        intereses.put("Nail Art","Arts & Crafts");
        intereses.put("Needlepoint","Arts & Crafts");
        intereses.put("Noodling","Extreme");
        intereses.put("Off Road Driving","Extreme");
        intereses.put("Origami","Arts & Crafts");
        intereses.put("Owning an antique car","Outdoors");
        intereses.put("Paintball","Outdoors");
        intereses.put("Painting","Arts & Crafts");
        intereses.put("Papermache","Arts & Crafts");
        intereses.put("Papermaking","Arts & Crafts");
        intereses.put("Paragliding or Power Paragliding","Extreme");
        intereses.put("Parkour","Extreme");
        intereses.put("People Watching","Intellectual");
        intereses.put("Photography","Arts & Crafts");
        intereses.put("Piano","Music");
        intereses.put("Pilates","Sports");
        intereses.put("Pinochle","Games");
        intereses.put("Pipe Smoking","Games");
        intereses.put("Planking","Outdoors");
        intereses.put("Playing music","Music");
        intereses.put("Pole Dancing","Dancing");
        intereses.put("Pottery","Arts & Crafts");
        intereses.put("Powerboking","Extreme");
        intereses.put("Protesting","Intellectual");
        intereses.put("Puppetry","Performing Arts");
        intereses.put("Pyrotechnics","Outdoors");
        intereses.put("Quilting","Arts & Crafts");
        intereses.put("R/C Boats","RC Hobbies");
        intereses.put("R/C Cars","RC Hobbies");
        intereses.put("R/C Helicopters","RC Hobbies");
        intereses.put("R/C Planes","RC Hobbies");
        intereses.put("Racing Pigeons","Outdoors");
        intereses.put("Raftign","Outdoors");
        intereses.put("Rapping","Music");
        intereses.put("Reading","Educational");
        intereses.put("Renaissance Faire","Performing Arts");
        intereses.put("Rescuing Abused or Abandoned Animals","Pets");
        intereses.put("Robotics","High Tech");
        intereses.put("Rock Balancing","Outdoors");
        intereses.put("Rock Collecting","Collecting");
        intereses.put("Rockets","Outdoors");
        intereses.put("Rocking AIDS Babies","Philantropy");
        intereses.put("Roleplaying","Performing Arts");
        intereses.put("Roller Derby","Extreme");
        intereses.put("Running","Sports");
        intereses.put("Running of the Bulls","Extreme");
        intereses.put("Sailing","Outdoors");
        intereses.put("Saltwater Aquariums","Pets");
        intereses.put("Sand Castles","Outdoors");
        intereses.put("Sandboarding","Outdoors");
        intereses.put("Scrapbooking","Arts & Crafts");
        intereses.put("Scuba Diving","Extreme");
        intereses.put("Self Defense","Outdoors");
        intereses.put("Sewing","Arts & Crafts");
        intereses.put("Shark Diving","Outdoors");
        intereses.put("Shark Fishing","Outdoors");
        intereses.put("Shopping","Collecting");
        intereses.put("Singing in Choir","Music");
        intereses.put("Skateboarding","Extreme");
        intereses.put("Skeet Shooting","Outdoors");
        intereses.put("Sketching","Arts & Crafts");
        intereses.put("Skiing","Outdoors");
        intereses.put("Sky Diving","Extreme");
        intereses.put("Slack Lining","Outdoors");
        intereses.put("Slingshots","Outdoors");
        intereses.put("Slot Car Racing","RC Hobbies");
        intereses.put("Snorkeling","Outdoors");
        intereses.put("Snow Skiing","Outdoors");
        intereses.put("SnowBoarding","Extreme");
        intereses.put("Snowmobiling","Extreme");
        intereses.put("Soap Making","Arts & Crafts");
        intereses.put("Soccer","Sports");
        intereses.put("Socializing","Intellectual");
        intereses.put("Speed Cubing","Games");
        intereses.put("Spelunkering","Extreme");
        intereses.put("Squash","Sports");
        intereses.put("Stramp Collecting","Collecting");
        intereses.put("Storm Chasing","Outdoors");
        intereses.put("Storytelling","Performing Arts");
        intereses.put("Street Luge","Extreme");
        intereses.put("String Figures","Arts & Crafts");
        intereses.put("Surf Fishing","Outdoors");
        intereses.put("Surfing","Extreme");
        intereses.put("Survival","Outdoors");
        intereses.put("Swimming","Outdoors");
        intereses.put("Tai Chi","Sports");
        intereses.put("Tattign","Arts & Crafts");
        intereses.put("Taxidermy","Arts & Crafts");
        intereses.put("Tea tasting","Food & Drink");
        intereses.put("Tennis","Sports");
        intereses.put("Tesla Coils","Educational");
        intereses.put("Tetris","Games");
        intereses.put("Textiles","Arts & Crafts");
        intereses.put("Tombstone Rubbing","Arts & Crafts");
        intereses.put("Tool Collecting","Collecting");
        intereses.put("Toy Collecting","Collecting");
        intereses.put("Traveling","Outdoors");
        intereses.put("Treasure Hunting","Outdoors");
        intereses.put("Triathlon","Sports");
        intereses.put("Tutoring Children","Philantropy");
        intereses.put("Ultimate Frisbee","Sports");
        intereses.put("Urban Exploration","Outdoors");
        intereses.put("Video Games","Games");
        intereses.put("Violin","Music");
        intereses.put("Volunteer","Philantropy");
        intereses.put("Wakeboarding","Extreme");
        intereses.put("Walking","Outdoors");
        intereses.put("Warhammer","Games");
        intereses.put("Watching Sporting Events","Outdoors");
        intereses.put("Water Ski","Outdoors");
        intereses.put("Waterfall Kayaking","Extreme");
        intereses.put("Weighlifting","Sport");
        intereses.put("White Water Rafting","Extreme");
        intereses.put("Windsurfing","Extreme");
        intereses.put("Wine Making","Food & Drink");
        intereses.put("Wingsuit Flying","Extreme");
        intereses.put("Woodworking","Arts & Crafts");
        intereses.put("Working in a food pantry","Philantropy");
        intereses.put("Working on cars","Outdoors");
        intereses.put("World Record Breaking","Outdoors");
        intereses.put("Wrestling","Sports");
        intereses.put("Writting","Writting");
        intereses.put("Writting Music","Writting");
        intereses.put("Writting Songs","Writting");
        intereses.put("Xpogo","Extreme");
        intereses.put("Yoga","Sports");
        intereses.put("YoYo","Games");
        intereses.put("Ziplining","Outdoors");
        intereses.put("Zumba","Sports");


        // Obtener el layout donde se van a mostrar los intereses
        LinearLayout layoutIntereses = findViewById(R.id.layoutIntereses);

        // Agregar los intereses al layout
        for (String interes : intereses.keySet()) {
            String categoria = intereses.get(interes);

            // Crear un elemento TextView para mostrar el interés
            TextView textView = new TextView(this);
            textView.setText(categoria);
            layoutIntereses.addView(textView);

            // Crear un elemento CheckBox para seleccionar la categoría del interés
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(interes);
            layoutIntereses.addView(checkBox);
        }

        // Obtener el nombre del usuario y mostrarlo en la vista
        String message = "Heriberto";
        TextView textViewN = findViewById(R.id.editarTextoNombre);
        textViewN.setText(message);
    }




    public void actualizarInformacionPersonal(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(editarInformacionPersonal.this);

        myAlertBuilder.setTitle("Actualizar Información");
        myAlertBuilder.setMessage("Presiona 'ACEPTAR' para actualizar la información:");

        myAlertBuilder.setPositiveButton("Aceptar", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked the OK button.
                        Toast.makeText(getApplicationContext(), "Actualizacion realizada",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Cancelar", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Canceló la actualización.",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        myAlertBuilder.show();

    }

    public void eliminarCuenta(View view) {

        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(editarInformacionPersonal.this);

        myAlertBuilder.setTitle("Eliminar Cuenta");
        myAlertBuilder.setMessage("Presiona 'SI' para eliminar la cuenta:");

        myAlertBuilder.setPositiveButton("No", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked the OK button.
                        Toast.makeText(getApplicationContext(), "Canceló la eliminación.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Si", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "La cuenta fue eliminada.",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        myAlertBuilder.show();
    }
}