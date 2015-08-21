package GWTP9.shared;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class CzlowiekResult implements Result {

	private String odpowiedzZSerwera = "Sa dwa uda, albo sie uda albo sie nie uda";

	public CzlowiekResult(final String odpowiedzZSerwera) {
		this.odpowiedzZSerwera = odpowiedzZSerwera;
	}

	@SuppressWarnings("nieuzywany")
	public CzlowiekResult() {
		super();
	}

	public String getOdpowiedzZSerwera() {
		return odpowiedzZSerwera;
	}

}
