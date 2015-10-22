package metodo;


public class Main {
	// primero crean un metodo principal que recibe un arreglo de cadenas donde implementan arreglo con matrices
		public static void main(String[] args) {

			double cal[][] = new double[5][10];
			llenar(cal);
			mostrar(cal);
		}


	// segundo llenan la matriz y hacen el proceso para como recorrer una matriz
	public static void llenar(double cal[][]){
		for(int filas=0; filas<cal.length; filas++){
			for(int colum=0; colum<cal[filas].length; colum++){
				cal[filas][colum]=Math.round((Math.random()*5)+5);
			}
		}
	}

   // tercero crean otro metodo para imprimir las calificasiones, declaran una variable llamada promedio para que de el promedio total d cada uno de los salones
	public static void mostrar (double cal[][]){
		for(int filas=0; filas<cal.length; filas++){
			double prom=0;
			System.out.print("salon "+filas+" =");
			for(int colum=0; colum<cal[filas].length; colum++){
				System.out.print(cal[filas][colum] + " ");
				prom+=cal[filas][colum];
			}
			System.out.println(" promedio: "+(prom/cal[filas].length));
		}
	}
}



