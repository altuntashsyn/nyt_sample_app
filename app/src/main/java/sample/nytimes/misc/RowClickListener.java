package sample.nytimes.misc;

public interface RowClickListener<T> {

    void onRowClick(int row, T item);

}