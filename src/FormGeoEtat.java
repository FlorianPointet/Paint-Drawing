public class FormGeoEtat {
	private FormGeoSelectEtat currentState;
	
	public FormGeoEtat() {
		currentState = new EtatNotSelected(); //default state
	}
	public void setEtat(FormGeoSelectEtat state) {
		currentState = state;
	}
	public boolean Etatselect() {
		return currentState.Etatselect();
	}
}