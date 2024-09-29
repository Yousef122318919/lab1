public class lab1 {
		public static void main(String[] args) {
			int[]k= new int[8];
			for (int i=0;i<8;i+=1) {
				k[i]=(i+1)*2;
			}
			float[] x = new float[18];
		        for (int i = 0; i < 18; i++) {
		            x[i] = (float) (Math.random() * 14 - 3);
		        }

		        double[][] n = new double[6][18];
		        for (int i = 0; i < 6; i++) {
		            for (int j = 0; j < 18; j++) {
		                if (k[i] == 10) {
		                    n[i][j] = Math.cos(Math.pow(Math.tan(x[j]), 1.0 / 3));
		                } else if (k[i] == 8 || k[i] == 14 || k[i] == 16) {
		                    n[i][j] = Math.pow((Math.exp(Math.tan(x[j])) / (Math.PI - Math.exp(Math.exp(x[j])))), 2);
		                } else {
		                    double temp = Math.atan((x[j] + 5.5) / 17);
		                    n[i][j] = 3 - Math.tan(Math.pow((1.0 / 2) / temp, 2));
		                }
		            }
		        }

		        for (int i = 0; i < 6; i++) {
		            for (int j = 0; j < 18; j++) {
		                System.out.printf("%.5.8f ", n[i][j]);
		            }
		            System.out.println();
		        }
		    }
		}
