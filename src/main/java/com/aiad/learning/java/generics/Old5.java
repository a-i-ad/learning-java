package com.aiad.learning.java.generics;

/**
 * <p>ジェネリクスの改修のサンプルコード。ここではジェネリックメソッド化する練習をして欲しい。</p>
 * <p>このコードが抱える問題
 * <ul>
 * <li>ReportUtil#createReport 及び ReportUtil#createReport2 の2つのメソッドは共に ReportDto
 * クラスを戻すがメソッド createReport2 はRecordsDto2,TotalDto2を持ったReportDto点が他方と異なる。
 * しかしながら、使用する側（このプログラム）では createReport2 の戻り値に RecordsDto2,TotalDto2を
 * 持っているReportDtoであることを保証できない問題がある。</li>
 * <li>ReportUtil#createReport2 の実装が勝手に修正され、異なるクラス例えば RecordsDto3 がセットされ
 * るようになったとしても、コンパイルエラーとして検出できない。</li>
 * <li>RecordsDto, RecordsDto2 共にフィールドに原型Listが使用されているため型安全性が低い。</li>
 * </ul></p>
 * @author aki
 *
 */
public class Old5 {
    public static void main(String[] args) {
        // 下手なコード書くの大変
        // レポートの表示部分っぽいやつ

        ReportDto report = ReportUtil.createReport();

        ReportDto report2 = ReportUtil.createReport2();
    }
}
