package net.bible.android.view.activity.page.actionbar;

import net.bible.android.view.activity.page.MenuCommandHandler;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;

public class BibleActionBarManager {

	private HomeTitle homeTitle = new HomeTitle();
//	private NavigationDrawer navigationDrawer = new NavigationDrawer();
	private BibleActionBarButton bibleActionBarButton = new BibleActionBarButton();
	private CommentaryActionBarButton commentaryActionBarButton = new CommentaryActionBarButton();
	private DictionaryActionBarButton dictionaryActionBarButton = new DictionaryActionBarButton();
	private StrongsActionBarButton strongsActionBarButton = new StrongsActionBarButton();
	
	public void prepareOptionsMenu(Activity activity, Menu menu, ActionBar actionBar, MenuCommandHandler menuCommandHandler) {
		homeTitle.addToBar(actionBar, activity);
		//navigationDrawer.addToBar(activity, actionBar, menuCommandHandler);
		
		bibleActionBarButton.addToMenu(menu);
		commentaryActionBarButton.addToMenu(menu);
		dictionaryActionBarButton.addToMenu(menu);
		strongsActionBarButton.addToMenu(menu);
	}
	
	public void updateButtons() {
		homeTitle.update();
		//navigationDrawer.update();
		
		bibleActionBarButton.update();
		commentaryActionBarButton.update();
		dictionaryActionBarButton.update();
		strongsActionBarButton.update();
	}
	
    public void onPostCreate() {
    	//navigationDrawer.onPostCreate();
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	return false; //navigationDrawer.onOptionsItemSelected(item);
    }
	
}