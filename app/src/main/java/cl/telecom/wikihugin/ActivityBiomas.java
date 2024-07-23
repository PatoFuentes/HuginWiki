package cl.telecom.wikihugin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityBiomas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biomas);

        TextView biomaText = findViewById(R.id.biomaText);
        LinearLayout biomasLayout = findViewById(R.id.biomasLayout);
        TextView biomaDescription = findViewById(R.id.biomaDescription);
        Button backButton = findViewById(R.id.backButton);

        String bioma = getIntent().getStringExtra("BIOMA");
        if (bioma != null) {
            biomaText.setText(bioma);
            switch (bioma) {
                case "Planicies":
                    biomasLayout.setBackgroundResource(R.drawable.planicies);
                    biomaDescription.setText("Las Praderas son un bioma tranquilo cubierto de hierba, salpicado de hayas, abedules y robles.\n" +
                            "También hay helechos, ríos, lagos y colinas. Es el bioma inicial y, por tanto, el menos difícil.\n" +
                            "El jugador puede encontrar varios puntos de interés mientras explora este bioma, como cementerios vikingos, aldeas draugr y numerosos tipos de estructuras abandonadas.");
                    break;
                case "Bosque Oscuro":
                    biomasLayout.setBackgroundResource(R.drawable.bosqueoscuro);
                    biomaDescription.setText("Los biomas del Bosque Negro son bosques de coníferas llenos de vegetación densa y exuberante. Un manto bajo de helechos, troncos talados, tocones y plantas de cardo se eleva sobre un dosel de pinos y abetos. Las colinas onduladas están interrumpidas por enormes rocas expuestas y yacimientos de cobre dormidos. La costa está llena de calas, ensenadas e incluso marismas, y está bordeada de brillantes depósitos de estaño, listos para ser recogidos.\n" +
                            "Es el único bioma donde se puede extraer Cobre y Estaño, disponible para el jugador después de derrotar a Eikthyr y adquirir un pico Antler. Grandes cantidades de Greydwarfs deambulan por allí, junto con el ocasional Troll y la manada de Skeletons. \n" +
                            "El bosque también alberga las Cámaras Sepulcrales, la primera mazmorra del juego. Estas cámaras son la primera fuente de núcleos Surtling, que permiten al jugador construir una fundición y empezar a procesar metales. Normalmente, el jugador explorará el Bosque Negro como segundo bioma, después de las Praderas.");
                    break;
                case "Pantano":
                    biomasLayout.setBackgroundResource(R.drawable.pantano);
                    biomaDescription.setText("El Pantano es un bioma. Los pantanos son zonas oscuras y fangosas, llenas de enormes árboles y criaturas hostiles. Los enormes árboles cubren el cielo en el pantano, haciendo que el bioma sea siempre difícil de ver. Los géiseres de fuego son un hallazgo poco común en el bioma, siempre rodeados por 3 Surtlings. En el pantano también se puede encontrar chatarra, un material de artesanía. También hay estatuas de piedra en el pantano. Su propósito es actualmente desconocido.\n" +
                            "En el pantano siempre llueve ligeramente, independientemente del tiempo que haga en otros lugares; esto significa que el jugador siempre estará Mojado cuando viaje por el pantano, lo que aumenta aún más la dificultad de la zona, especialmente por la noche, donde el jugador siempre tendrá Frío. El veneno es también un efecto común en el pantano de Oozers, Blobs y sanguijuelas, por lo que el hidromiel resistente al veneno es particularmente útil.\n" +
                            "El pantano contiene Criptas Hundidas, que requieren una Llave del Pantano para ser desbloqueadas. Estas criptas son un conjunto de habitaciones que a menudo están separadas por montones de chatarra fangosa, que se puede extraer para obtener chatarra, restos de cuero y huesos marchitos. Además, se pueden encontrar estructuras abandonadas y criaturas hostiles.\n" +
                            "Además de las Criptas Hundidas, se pueden encontrar pilas de chatarra fangosa enterradas bajo el pantano. Estas vetas pueden ser localizadas usando el Wishbone después de derrotar a Bonemass, aunque debe tenerse en cuenta que tienden a ser poco comunes y generalmente no son viables para proporcionar cantidades significativas de hierro, porque el jugador es incapaz de minar el depósito cuando está completamente sumergido en el agua. Además, la minería es una actividad ruidosa y atraerá a la fauna local.");
                    break;
                case "Montaña":
                    biomasLayout.setBackgroundResource(R.drawable.montana);
                    biomaDescription.setText("La Montaña es un bioma que presenta picos cubiertos de nieve helada enmarcados por abetos. Esta región helada e implacable es el hogar de Lobos y otros hijos de Fenrir. Los Drakes, descendientes de Moder, pueden encontrarse en los cielos haciendo sus nidos en sus cumbres donde ponen sus huevos de Dragón. Ten cuidado con las pilas de piedra movedizas, podrían estar más vivas de lo que crees, agitando al Golem de Piedra que descansa.\n" +
                            "Las montañas también pueden contener cuevas de Escarcha, que son una mazmorra hogar de Cultistas y su mascota Ulv. Los murciélagos también tienen su hogar aquí y pueden asustar a los vikingos desprevenidos. Se pueden encontrar cristales creciendo naturalmente en las paredes y ocasionalmente contienen un gran lago subterráneo, ten cuidado de no despertar al Golem de Piedra que también puede estar descansando allí.\n" +
                            "Adentrarse en el bioma de la montaña causará el efecto de Congelación en el jugador. Este efecto se puede anular bebiendo hidromiel resistente a la escarcha, llevando una capa Lox, una capa de piel de lobo, un abrigo Fenris o el peto de armadura de lobo. Las piernas de la armadura Lobo no ofrecen resistencia a la escarcha. Las hogueras cercanas también anulan este efecto.");
                    break;
                case "Llanuras":
                    biomasLayout.setBackgroundResource(R.drawable.llanura);
                    biomaDescription.setText("Las Llanuras son un bioma muy abierto con colinas onduladas y escasos árboles. Alberga muchos tipos diferentes de formaciones rocosas, algunas de apariencia natural (como enormes monolitos de piedra destructibles) y otras construidas por los fulings nativos. Se pueden ver pobladas aldeas fuling repartidas por las llanuras, construidas con piel y huesos de ciervo.\n" +
                            "A pesar de su apariencia inicialmente tranquila, el bioma de las llanuras es difícil y peligroso de recorrer. Los recursos exclusivos de las llanuras permiten al jugador fabricar armas con metal negro e hilo de lino, y alimentos con harina de cebada y carne de salmón. Por último, las Llanuras contienen alquitrán en sus pozos y alrededor de ellos, lo que permite al jugador construir muebles de alto nivel y edificios o decoraciones de madera oscura.\n" +
                            "Ten cuidado cuando navegues cerca de las Llanuras, ya que los deathquitos pueden aparecer en la playa y atacar lejos en el agua.");
                    break;
                case "Tierras Brumosas":
                    biomasLayout.setBackgroundResource(R.drawable.tierrasbrumosas);
                    biomaDescription.setText("Las Tierras Brumosas es un bioma montañoso y escarpado cubierto por una niebla perpetua que lo cubre todo y dificulta la visión en su interior. Está lleno de valles, cañadas, barrancos e incluso mesetas salpicadas por gigantescos peñascos negros que a menudo asoman por encima de la niebla. En estas rocas crecen brotes de Yggdrasil. En el suelo se pueden encontrar raíces de Yggdrasil más grandes y brillantes, a menudo visibles a través de la niebla. Su costa es igualmente traicionera, y recibe al barco con acantilados escarpados, embarcaderos abruptos y bancos de arena rocosos. Se pueden utilizar linternas Wisplights y antorchas Wisp colocables para despejar la niebla permeante, pero para ambas es necesario derrotar a Yagluth.\n" +
                            "Este bioma es opresivo y bastante difícil de recorrer, a menudo hasta el punto de desorientar. Los enemigos son duros y a menudo ven al jugador antes de que éste los vea a ellos. Los Buscadores y los Soldados Buscadores son los enemigos más comunes, capaces de perseguir al jugador casi constantemente. Los Buscadores estándar tienen incluso la capacidad de volar si necesitan acceder a zonas más altas de las laderas. También reside aquí una raza neutral de Dvergr, que luchará activamente contra los enemigos para defender sus fortalezas. Si el jugador también los ataca, serán enemigos formidables.\n" +
                            "Las Tierras Brumosas, junto con su actualización de contenido, introduce una nueva mecánica de combate llamada Eitr. Se adquiere comiendo alimentos específicos elaborados a partir de los cultivos y criaturas del bioma, como los Magecaps. Eitr otorga al jugador la capacidad de usar una variedad de habilidades mágicas para luchar contra el duro entorno.\n");
                    break;
                case "Ashland":
                    biomasLayout.setBackgroundResource(R.drawable.ashlands);
                    biomaDescription.setText("Las Ashlands son un bioma infernal fundido que adopta la forma de una isla en forma de media luna en la parte más meridional del mundo. Se trata de un reino ardiente, cuyo terreno cambia cuanto más hacia el interior se viaja, con partes centrales ocupadas por la lava. El ejército no muerto de Charred conforma la población, entre otras criaturas.\n" +
                            "El agua que rodea el continente de las Ashlands está hirviendo, lo que destruirá todos los barcos de madera que intenten navegar hasta el bioma. Sólo el Drakkar, que se obtiene tras derrotar a la Reina, puede sobrevivir al peligroso viaje al bioma.\n" +
                            "La lluvia de ceniza que cae en el bioma destruye las estructuras. Hay que construir un generador de escudos para proteger las bases de los jugadores. Además, aquí el fuego se propaga entre las estructuras de madera.\n" +
                            "Este bioma fue el objetivo principal de la actualización homónima de Ashlands. Sigue la progresión de Mistlands");
                    break;
            }
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
