package hk.ust.cse.comp107x.bookapp2;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by Pallavi on 12-07-2018.
 */
public class suggestion extends SearchRecentSuggestionsProvider{

    public final static String AUTHORITY="com.sample.suggestion";
    public final static int MODE=DATABASE_MODE_QUERIES;
    public suggestion(){
        setupSuggestions(AUTHORITY,MODE);

    }



}
