package com.bignerdranch.android.webFragment.ui.notifications;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0014\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/bignerdranch/android/webFragment/ui/notifications/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_filteredMovies", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bignerdranch/android/webFragment/ui/models/Movie;", "_movies", "_query", "", "filteredMovies", "Landroidx/lifecycle/LiveData;", "getFilteredMovies", "()Landroidx/lifecycle/LiveData;", "movies", "getMovies", "query", "getQuery", "filterMovies", "", "setFilteredMovies", "value", "setMovies", "setQuery", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie>> _movies = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _query = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie>> _filteredMovies = null;
    
    public MovieViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie>> getMovies() {
        return null;
    }
    
    public final void setMovies(@org.jetbrains.annotations.NotNull
    java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie>> getFilteredMovies() {
        return null;
    }
    
    public final void setFilteredMovies(@org.jetbrains.annotations.NotNull
    java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> value) {
    }
    
    private final void filterMovies(java.lang.String query) {
    }
}