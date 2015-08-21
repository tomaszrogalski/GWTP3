package GWTP9.serwer;

import java.sql.SQLException;

import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

import GWTP9.shared.CzlowiekAction;
import GWTP9.shared.CzlowiekResult;

public class CzlowiekHandler implements ActionHandler<CzlowiekAction, CzlowiekResult> {

	@Override
	public CzlowiekResult execute(CzlowiekAction action, ExecutionContext context) throws ActionException {

		// Do dao w tej lini przekazuje czlowieka
		try {
			new CzlowiekDao().createCzlowiek(action.getCzlowiekDto().StworzObiektKlasyCzlowiekZCzlowiekDto());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CzlowiekResult("Hejka");
	}

	@Override
	public Class<CzlowiekAction> getActionType() {

		return CzlowiekAction.class;
	}

	@Override
	public void undo(CzlowiekAction action, CzlowiekResult result, ExecutionContext context) throws ActionException {

	}
}
