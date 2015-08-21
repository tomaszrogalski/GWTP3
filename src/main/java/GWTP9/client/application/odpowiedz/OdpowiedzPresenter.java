package GWTP9.client.application.odpowiedz;

import org.apache.velocity.runtime.log.Log;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTP9.client.place.NameTokens;
import GWTP9.shared.CzlowiekAction;
import GWTP9.shared.CzlowiekDto;
import GWTP9.shared.CzlowiekResult;

public class OdpowiedzPresenter extends Presenter<OdpowiedzPresenter.MyView, OdpowiedzPresenter.MyProxy> {
	// public static final String textToServerParam = "textToServer";
	// private String textToServer = "dupa dupa";

	interface MyView extends View {
		void setOdpowiedzSerevera(String serverOdpowiedz);
	}

	@NameToken(NameTokens.odpowiedz)
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<OdpowiedzPresenter> {
	}

	private final DispatchAsync dispatcher;

	@Inject
	OdpowiedzPresenter(EventBus eventBus, MyView view, MyProxy proxy, DispatchAsync dispatcher) {
		super(eventBus, view, proxy, RevealType.Root);
		this.dispatcher = dispatcher;
	}

	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
	}



	protected void onReset() {
		super.onReset();
		CzlowiekDto czlowiekDoWyslania = new CzlowiekDto(5L, "imie", "nazwisko", "pesel", "ulica", "nrdomu",
				"miejscowosc");
//to ponizej sie wywal Jak probuje dodac czlowieka
		dispatcher.execute(new CzlowiekAction("sadasd"), new AsyncCallback<CzlowiekResult>() {

			@Override
			public void onFailure(Throwable caught) {
				getView().setOdpowiedzSerevera("moze innym razem: " + caught.getMessage());
			
			}

			@Override
			public void onSuccess(CzlowiekResult result) {
				getView().setOdpowiedzSerevera(result.getOdpowiedzZSerwera());

			}
		});
	}
}
