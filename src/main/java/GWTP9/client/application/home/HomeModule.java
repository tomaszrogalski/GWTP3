package GWTP9.client.application.home;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import GWTP9.shared.CzlowiekDto;

public class HomeModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(HomePagePresenter.class, HomePagePresenter.MyView.class, HomePageView.class,
				HomePagePresenter.MyProxy.class);
	}
}
