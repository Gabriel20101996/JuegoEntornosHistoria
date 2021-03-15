package JuegoOpciones;

import java.util.Scanner;

public class JuegoHistoriaOpciones {

	 static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {

			System.out.println("Bienvenido a la historia donde tú eres el protagonista!");
			System.out.println("");

			System.out.println("Podrás elegir entre varias opciones para decidir el rumbo de tu aventura.");
			System.out.println("");
			
			System.out.println("La historia comienza a las 9 de la mañana del 15 de diciembre de 1995 en el hospital Infanta Sofía de Madrid, "
					+ "hacia un frio helador y aún no había salido el sol.");
			System.out.println("Hoy era un día especial, Ingrid Baker estaba a punto de dar a luz. El médico anteriormente le había avisado que iba a tener dos mellizos, un niño y una niña.");
			System.out.println("");
			
			System.out.println("Debido a esta situación, el padre; Richard Williams, decidió dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
			System.out.println("");

			System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiaría drásticamente el devenir de la historia, "
					+ "y eres tú quién debe decidir qué rumbo tomar. Este día marcará tu vida y a partir de ahí depende de ti y de tus actos en quién tú decidas ser.");
			System.out.println("");
			
			System.out.println("Llega el momento de tomar tu primera decisión. Estas en la una encrucijada antes de nacer.");
			System.out.println("");
			
			System.out.println("1.- Ingrid sobreviva al parto pero eso involucraría que tu hermano fallezca.");
			System.out.println("2.- Decidir salvar a tu hermano, tendrá como consecuencia la muerte de Ingrid.");
			int eleccion = scanner.nextInt();
			
			if (eleccion == 1){
				
				
			} else {
				
				
			}
			
		}
		
		static void opcion3() {
			
			System.out.println("Decides colaborar con la CNP");
			System.out.println();
			System.out.println("Estás en la ubicación donde se sitúa el portal. Una vez allí, entras junto con los agentes del GEO a las instalaciones, de camino allí al portal, hay complicaciones.");
			System.out.println();
			System.out.println("Las entidades van matando poco a poco a todos los agentes.");
			System.out.println();
			System.out.println("Huyendo de las entidades consigues llegar hasta el portal, gracias a Aiden.");
			System.out.println();
			System.out.println("Una vez allí, encuentras un centro de controles, en el que hay un botón grande y rojo.");
			System.out.println();
			System.out.println("1.- Pulsar el botón y arriesgarte a que cierre el portal");
			System.out.println("2.- No pulsar el botón e intentar buscar una manera de cerrarlo por ti misma.");
			System.out.println();
			System.out.println("Decides: ");
			
			int eleccion = scanner.nextInt();
			
			if(eleccion == 1) {
				
				opcion5();
			}else {
				
				opcion6();
			}
		}
		
		
		static void opcion4() {
			
			System.out.println("Decides no colaborar con la CNP, por ese motivo, deciden investigarte para cerrar el portal sin tu ayuda.");
			System.out.println();
			System.out.println("En una de las investigaciones Aiden se corrompe y debido a ello, tu cuerpo no es capaz de soportarlo y entras en un coma en el que nunca volverás a despertar.");
		}
		
		static void opcion5() {
			
			System.out.println("Decides pulsar el botón y el portal se comienza a cerrar, se inicia una cuenta atrás durante la cuál tienes que decidir entre:");
			System.out.println();
			System.out.println("1.- Permanecer en el mundo de los vivos y desvincularte definitivamente de Aiden");
			System.out.println("2.- Acompañar a Aiden al inframundo y convertirte en una entidad");
			System.out.println();
			System.out.println("Decides: ");
			int eleccion = scanner.nextInt();
			
			if(eleccion == 1) {
				
				opcion7();
			}else {
				
				opcion8();
			}
		}
		
		
		static void opcion6() {
			
			System.out.println("Mientras que intentas buscar la manera de cerrarlo, las entidades destuyen el centro de control generando una explosión, causando tu muerte.");
			System.out.println();
			System.out.println("Debido a esto, el inframundo conquista el mundo de los vivos.");
		}
		
		static void opcion7() {
			
			System.out.println("Al cerrar el portal Aiden se despide de ti y descubres que era el espíritu de tu hermano.");
			System.out.println();
			System.out.println("Has conseguido sobrevivir y salvar el mundo, decides vivir tu vida con la mayor normalidad posible y teniendo a Aiden en tu recuerdo");
		}
		
		static void opcion8() {
			
			System.out.println("Aiden te confiesa que es tu hermano y decides morir e ir al inframundo, permaneciendo con él eternamente");
		}

		static void opcion2() {
			
			System.out.println("Decidir salvar a tu hermano, tendrá como consecuencia la muerte de Ingrid.");
			System.out.println("");
			System.out.println("Al tomar esta decisión, has conseguido salvar a tu hermano Aiden. En contrapartida, tu madre Ingrid no ha logrado sobrevivir al parto.");
			System.out.println("Este trágico acontecimiento provoca que Aiden y tu os crieis juntos en un orfanato.");
			System.out.println("");
			System.out.println("17 años después…");
			System.out.println("");
			System.out.println("En el orfanato, te hiciste amiga de uan chica muy similar a ti, Zoe Smith.");
			System.out.println("Era sin duda tu mejor amiga del lugar y al tener ambas un carácter muy parecido, os apoyabais en los momentos difíciles. ");
			System.out.println("Zoe había perdido a sus padres por un accidente de tráfico y llevaba unos pocos años en el orfanato. Pero desde que entablasteis conversación por primera vez, se generó una clara complicidad y habiais forjado una fuerte y cercana amistad.");
			System.out.println("");
			System.out.println("Al principio Aiden la veía con ojos de rechazo ya que sentía un distanciamiento progresivo contigo por dicha relación de amistad.");
			System.out.println("Aiden era un chico introvertido, serio, independiente, que no se habría fácilmente ante otras personas y en el fondo se sentía solo. ");
			System.out.println("Por ello, veía a Zoe como una enemiga y aún no había hablado con ella ni una sola vez.");
			System.out.println("");
			System.out.println("Un día conseguiste convencer a Aiden de que Zoe no era el problema y le pediste que le diera una oportunidad para que se diera cuenta que ella también podría ser buena amiga de ambos y de esta manera fortalecer el vínculo con tu hermano.");
			System.out.println("Con el paso del tiempo, tanto tu como Aiden y Zoe empezastéis a compartir buenos momentos en el orfanato y formasteis un grupo unido y cómplice.");
			System.out.println("Pero poco a poco, Aiden se empezó a enamorar de Zoe y a tener fuertes sentimientos por ella.");
			System.out.println("");
			System.out.println("Después de un largo periodo de reflexión por parte de tu hermano, decide confesar sus sentimientos a Zoe.");
			System.out.println("Aunque Zoe se sintió muy halagada por las palabras tan sentidas de Aiden, ella no sentía lo mismo por él.");
			System.out.println("Aiden se quedó en shock. Al principio estaba totalmente paralizado y no movía ni un músculo.");
			System.out.println("Pero rápidamente se puso a temblar, y se exclamó con un llanto desconsolado diciendo que ya no quería ser más su amigo.");
			System.out.println("Seguidamente a ello, Aiden se fue a su habitación sin mirar a nadie.");
			System.out.println("");
			System.out.println("Esa misma noche, Aiden se consigue fugar del orfanato sin mirar atrás, perdiéndose en los entresijos del bosque.");
			System.out.println("");
			System.out.println("Decides:");
			System.out.println("1.-Salir al bosque a buscar a Aiden.");
			System.out.println("2.-Esperar en el orfanato a que vuelva.");
			
			int eleccionBosque=scanner.nextInt();
			
			if(eleccionBosque==1) {
				
			} else {
				
			}
			
		}
}
