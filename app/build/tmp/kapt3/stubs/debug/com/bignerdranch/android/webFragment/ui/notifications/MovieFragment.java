package com.bignerdranch.android.webFragment.ui.notifications;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/bignerdranch/android/webFragment/ui/notifications/MovieFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter$onItemClickMovie;", "()V", "adapter", "Lcom/bignerdranch/android/webFragment/adapters/MovieAdapter;", "allMovies", "", "Lcom/bignerdranch/android/webFragment/ui/models/Movie;", "binding", "Lcom/bignerdranch/android/application_practica2/databinding/FragmentMovieBinding;", "context", "Landroid/content/Context;", "filteredMovies", "movieViewModel", "Lcom/bignerdranch/android/webFragment/ui/notifications/MovieViewModel;", "moviesOriginal", "SearchView", "", "searchView", "Landroidx/appcompat/widget/SearchView;", "filterMovies", "query", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMovieClick", "movieUrl", "onResume", "app_debug"})
public final class MovieFragment extends androidx.fragment.app.Fragment implements com.bignerdranch.android.webFragment.adapters.MovieAdapter.onItemClickMovie {
    private com.bignerdranch.android.application_practica2.databinding.FragmentMovieBinding binding;
    private android.content.Context context;
    private com.bignerdranch.android.webFragment.adapters.MovieAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> allMovies;
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> moviesOriginal;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.bignerdranch.android.webFragment.ui.models.Movie> filteredMovies;
    private com.bignerdranch.android.webFragment.ui.notifications.MovieViewModel movieViewModel;
    
    public MovieFragment() {
        super();
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onMovieClick(@org.jetbrains.annotations.NotNull
    java.lang.String movieUrl) {
    }
    
    private final void filterMovies(java.lang.String query) {
    }
    
    public final void SearchView(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.SearchView searchView) {
    }
}