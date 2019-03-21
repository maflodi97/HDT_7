/**
 * 
 */

/**
 * @author Marco FLores 16260
 *
 */
public class BinaryTree<E> {
	protected E info;
	protected BinaryTree<E> padre;
	protected BinaryTree<E> izquierdo;
	protected BinaryTree<E> derecho;
	
	public BinaryTree(E info, BinaryTree<E> padre, BinaryTree<E> izquierdo,
			 BinaryTree<E> derecho) {
		this.info=info;
		this.padre=padre;
		this.izquierdo=izquierdo;
		this.derecho=derecho;
	}
	
	/**
	 * @return el BinaryTree padre
	 */
	public BinaryTree<E> padre(){
		return padre;
	}
	/**
	 * @return el BinaryTree hijo de la izquierda
	 */
	public BinaryTree<E> izquierdo(){
		return izquierdo;
	}
	/**
	 * @return el BinaryTree hijo de la derecha
	 */
	public BinaryTree<E> derecho(){
		return derecho;
	}
	/**
	 * @param padre the padre to set
	 */
	public void setPadre(BinaryTree<E> padre) {
		this.padre=padre;
	}

	/**
	 * @return the info
	 */
	public E info() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(E info) {
		this.info = info;
	}

	/**
	 * @return the izquierdo
	 */
	public BinaryTree<E> getIzquierdo() {
		return izquierdo;
	}

	/**
	 * @param izquierdo the izquierdo to set
	 */
	public void setIzquierdo(BinaryTree<E> izquierdo) {
		this.izquierdo = izquierdo;
	}

	/**
	 * @return the derecho
	 */
	public BinaryTree<E> getDerecho() {
		return derecho;
	}

	/**
	 * @param derecho the derecho to set
	 */
	public void setDerecho(BinaryTree<E> derecho) {
		this.derecho = derecho;
	}

	/**
	 * @return the padre
	 */
	public BinaryTree<E> getPadre() {
		return padre;
	}
	

}
