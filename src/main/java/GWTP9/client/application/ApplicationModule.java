package GWTP9.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import GWTP9.client.application.home.HomeModule;
import GWTP9.client.application.odpowiedz.OdpowiedzModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new OdpowiedzModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
