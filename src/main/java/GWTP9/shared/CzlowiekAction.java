package GWTP9.shared;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

public class CzlowiekAction extends UnsecuredActionImpl<CzlowiekResult> {
	private CzlowiekDto czlowiekDto = new CzlowiekDto(7L, "imie", "nazwisko", "pesel", "ulica", "nrdomu", "miejscowosc");

//	public CzlowiekAction(final CzlowiekDto czlowiekDto) {
//
//		this.czlowiekDto = czlowiekDto;
//	}
	

	@SuppressWarnings("nieuzywany")
	public CzlowiekAction() {
		
	}

	public CzlowiekAction(String tekst) {
	super();

}

	public CzlowiekDto getCzlowiekDto() {
		
		return new CzlowiekDto(5L, "imie", "nazwisko", "pesel", "ulica", "nrdomu", "miejscowosc");
	}
}
