package com.bignerdranch.android.webFragment.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\tH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/bignerdranch/android/webFragment/database/MyDataBaseDao;", "", "insert", "", "data", "", "Lcom/bignerdranch/android/webFragment/database/MyData;", "([Lcom/bignerdranch/android/webFragment/database/MyData;)V", "query", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
@androidx.room.Dao
public abstract interface MyDataBaseDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.webFragment.database.MyData... data);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.webFragment.database.MyData... data);
    
    @androidx.room.Query(value = "Select * From MyData")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.bignerdranch.android.webFragment.database.MyData>> query();
}