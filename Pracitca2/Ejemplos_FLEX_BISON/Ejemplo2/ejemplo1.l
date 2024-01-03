%{

   #include <string.h>

   #include "ejemplo1.tab.h"

%}


%%


el|la|los|las 			{ return ARTICULO; }


coche|casa|avion|barco 	|
gato|gata|gatos|gatas  		{ return NOMBRE; }


azul|rojo|veloz		|      
alto|alta|altos|altas	|
feo|fea|feos|feas		{ return ADJETIVO; }


come|comen|mira|miran	|
salta|saltan|rie|rien		{ return VERBO; }


a|de|en|con|por|desde		{ return PREPOSICION; }


\n                              { return ('\n'); } 


.				;


%%


