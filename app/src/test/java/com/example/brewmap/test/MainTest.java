package com.example.brewmap.test;

import com.example.brewmap.DaggerTestComponent;
import com.example.brewmap.ui.main.MainPresenter;
import com.example.brewmap.ui.main.MainScreen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

import static com.example.brewmap.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@Config(sdk=28)
@RunWith(RobolectricTestRunner.class)
public class MainTest {
    @Inject
    MainPresenter mainPresenter;
    private MainScreen mainScreen;

    @Before
    public void setUp(){
        DaggerTestComponent injector=setTestInjector();
        injector.inject(this);
        mainScreen=mock(MainScreen.class);
        mainPresenter.attachScreen(mainScreen);
    }

    @Test
    public void testSearch(){
        String query = "asd";
        mainPresenter.showBrewerySearchList(query);
        verify(mainScreen).showQueriedBreweries(query);
    }

    @After
    public void tearDown() {
        mainPresenter.detachScreen();
    }
}
