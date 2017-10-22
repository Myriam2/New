package Class;

public class VectorHelper {
/**
 * Date : 14/10/2017
 *  @author dell
 *  @version 1.0
 * la classe VectorHelper assure les opérations suivantes :
 *   • Trier les éléments d’un vecteur
 *   • Sommer deux vecteurs. Elle génére une exception si les deux vecteurs ont des  tailles différentes
 *   • Inverser les éléments d’un vecteur
 *   • Obtenir simultanément le minimum et le maximum d’un vecteur
 *   • Appliquer une formule (multiplication par 10 ) sous forme de fonction à tous les éléments d’un vecteur
 *
 *
 */

	/**
	 * int valeur de la taille du vecteur
	 */
	private int taille;
	private int[] tab;
	private int max;
	private int min;
	/**
	 * Consctucteur de la classe VectorHelper
	 * @param tai
	 * @param tab
	 */
	public VectorHelper1(int tai,int[] tab)
	{

		this.taille= tai;
		this.tab=tab;
		this.max = tab[0];
		this.min = tab[0];

	}

public void return_min_max()

{
	int i;
	for (i=0; i<this.taille; i++)
	{
		if (this.tab[i]>this.max) this.max = this.tab[i];
		if (this.tab[i]<this.min) this.min = this.tab[i];
	}

	}


public void multipl(int x)
{
	int i;
	for (i=0; i<this.taille; i++)
	{
		this.tab[i]=x*this.tab[i];
	}

	}
public void affich_vect()
{
int i ;
for (i=0; i<this.taille; i++)
{
 System.out.print(this.tab[i]+"|");
}
}

public void invertion_vector2() //inversion de l'ordre des elements du vecteur
{
	int tab1[] = new int[this.taille];
	int i,j=0;
	for (i=this.taille-1; i>=0; i--)
	{
		tab1[j]=this.tab[i];
		j++;
	}
	this.tab=tab1;
	}
public int get_min_vector()
{
	return(this.min);
}
public int get_max_vector()
{
	return(this.max);
}
public int get_taille()
{
	return(this.taille);
}
public int[] get_tab()
{
	return(this.tab);
}
public int get_tab_case(int i)
{
	return(this.tab[i]);
}
	
public static int[] aleatoireInt(int[] tab) {    // le but de cette methode est de generer des entier aleatoirement  
        int k = 0, valeur, i = 0;
        boolean existe = false;;
        Random r = new Random();

        for (i = 0; i < tab.length; i++) {
            existe = false;
            valeur = r.nextInt(borneSuperieur);

            for (k = 0; k < i; k++) {// on cherche la nouvelle valeur si elle existe  parmis les valeurs déja inserées
                if (tab[k] == valeur) {
                    existe = true;
                }
            }
            if (existe == false) {// si elle n'existe pas on l'insere
                tab[i] = valeur;
            } else {
                i = i - 1;// sinon puisue on a travaillé avec une boucle pour l'indice i est incremenré automatiuement 
                //alors on doit le decrementer afin de ne pas laisser des cases vide 
            }
        }
        return tab;
    }
public void multiplication(int x) //multiplication par x
{
	int i;
	for (i=0; i<this.taille; i++)
	{
		this.tab[i]=x*this.tab[i];
	}

	}
}
