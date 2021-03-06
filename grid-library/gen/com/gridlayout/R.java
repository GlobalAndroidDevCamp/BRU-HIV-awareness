/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.gridlayout;

public final class R {
    public static final class attr {
        /**  Alignment constants. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>alignBounds</code></td><td>0</td><td> Align the bounds of the children.
        See {@link android.widget.GridLayout#ALIGN_BOUNDS}. </td></tr>
<tr><td><code>alignMargins</code></td><td>1</td><td> Align the margins of the children.
        See {@link android.widget.GridLayout#ALIGN_MARGINS}. </td></tr>
</table>
         */
        public static int alignmentMode=0x7f010000;
        /**  The maxmimum number of columns to create when automatically positioning children. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int columnCount=0x7f010002;
        /**  When set to true, forces column boundaries to appear in the same order
        as column indices.
        The default is true.
        See {@link android.widget.GridLayout#setColumnOrderPreserved(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int columnOrderPreserved=0x7f010005;
        /**  The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_columnSpan=0x7f010008;
        /**  The row boundary delimiting the top of the group of cells
        occupied by this view. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_row=0x7f010006;
        /**  The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_rowSpan=0x7f010007;
        /**  The maxmimum number of rows to create when automatically positioning children. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int rowCount=0x7f010001;
        /**  When set to true, forces row boundaries to appear in the same order
        as row indices.
        The default is true.
        See {@link android.widget.GridLayout#setRowOrderPreserved(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int rowOrderPreserved=0x7f010004;
        /**  When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.
        The default value is false.
        See {@link android.widget.GridLayout#setUseDefaultMargins(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int useDefaultMargins=0x7f010003;
    }
    public static final class dimen {
        /**  The default gap between components in a layout. 
         */
        public static int default_gap=0x7f030000;
    }
    public static final class id {
        public static int alignBounds=0x7f020000;
        public static int alignMargins=0x7f020001;
    }
    public static final class styleable {
        /** Attributes that can be used with a GridLayout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #GridLayout_alignmentMode com.gridlayout:alignmentMode}</code></td><td> When set to alignMargins, causes alignment to take place between the outer
        boundary of a view, as defined by its margins.</td></tr>
           <tr><td><code>{@link #GridLayout_android_orientation com.gridlayout:android_orientation}</code></td><td> The orientation property is not used during layout.</td></tr>
           <tr><td><code>{@link #GridLayout_columnCount com.gridlayout:columnCount}</code></td><td> The maxmimum number of columns to create when automatically positioning children.</td></tr>
           <tr><td><code>{@link #GridLayout_columnOrderPreserved com.gridlayout:columnOrderPreserved}</code></td><td> When set to true, forces column boundaries to appear in the same order
        as column indices.</td></tr>
           <tr><td><code>{@link #GridLayout_rowCount com.gridlayout:rowCount}</code></td><td> The maxmimum number of rows to create when automatically positioning children.</td></tr>
           <tr><td><code>{@link #GridLayout_rowOrderPreserved com.gridlayout:rowOrderPreserved}</code></td><td> When set to true, forces row boundaries to appear in the same order
        as row indices.</td></tr>
           <tr><td><code>{@link #GridLayout_useDefaultMargins com.gridlayout:useDefaultMargins}</code></td><td> When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.</td></tr>
           </table>
           @see #GridLayout_alignmentMode
           @see #GridLayout_android_orientation
           @see #GridLayout_columnCount
           @see #GridLayout_columnOrderPreserved
           @see #GridLayout_rowCount
           @see #GridLayout_rowOrderPreserved
           @see #GridLayout_useDefaultMargins
         */
        public static final int[] GridLayout = {
            0x010100c4, 0x7f010000, 0x7f010001, 0x7f010002,
            0x7f010003, 0x7f010004, 0x7f010005
        };
        /**
          <p>
          @attr description
           When set to alignMargins, causes alignment to take place between the outer
        boundary of a view, as defined by its margins. When set to alignBounds,
        causes alignment to take place between the edges of the view.
        The default is alignMargins.
        See {@link android.widget.GridLayout#setAlignmentMode(int)}.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>alignBounds</code></td><td>0</td><td> Align the bounds of the children.
        See {@link android.widget.GridLayout#ALIGN_BOUNDS}. </td></tr>
<tr><td><code>alignMargins</code></td><td>1</td><td> Align the margins of the children.
        See {@link android.widget.GridLayout#ALIGN_MARGINS}. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:alignmentMode
        */
        public static final int GridLayout_alignmentMode = 1;
        /**
          <p>
          @attr description
           The orientation property is not used during layout. It is only used to
        allocate row and column parameters when they are not specified by its children's
        layout paramters. GridLayout works like LinearLayout in this case;
        putting all the components either in a single row or in a single column -
        depending on the value of this flag. In the horizontal case, a columnCount
        property may be additionally supplied to force new rows to be created when a
        row is full. The rowCount attribute may be used similarly in the vertical case.
        The default is horizontal. 
          <p>This corresponds to the global attribute          resource symbol {@link com.gridlayout.R.attr#android_orientation}.
          @attr name android:android_orientation
        */
        public static final int GridLayout_android_orientation = 0;
        /**
          <p>
          @attr description
           The maxmimum number of columns to create when automatically positioning children. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:columnCount
        */
        public static final int GridLayout_columnCount = 3;
        /**
          <p>
          @attr description
           When set to true, forces column boundaries to appear in the same order
        as column indices.
        The default is true.
        See {@link android.widget.GridLayout#setColumnOrderPreserved(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:columnOrderPreserved
        */
        public static final int GridLayout_columnOrderPreserved = 6;
        /**
          <p>
          @attr description
           The maxmimum number of rows to create when automatically positioning children. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:rowCount
        */
        public static final int GridLayout_rowCount = 2;
        /**
          <p>
          @attr description
           When set to true, forces row boundaries to appear in the same order
        as row indices.
        The default is true.
        See {@link android.widget.GridLayout#setRowOrderPreserved(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:rowOrderPreserved
        */
        public static final int GridLayout_rowOrderPreserved = 5;
        /**
          <p>
          @attr description
           When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.
        The default value is false.
        See {@link android.widget.GridLayout#setUseDefaultMargins(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:useDefaultMargins
        */
        public static final int GridLayout_useDefaultMargins = 4;
        /** Attributes that can be used with a GridLayout_Layout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #GridLayout_Layout_android_layout_column com.gridlayout:android_layout_column}</code></td><td> The column boundary delimiting the left of the group of cells
        occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_android_layout_gravity com.gridlayout:android_layout_gravity}</code></td><td> Gravity specifies how a component should be placed in its group of cells.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_columnSpan com.gridlayout:layout_columnSpan}</code></td><td> The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_row com.gridlayout:layout_row}</code></td><td> The row boundary delimiting the top of the group of cells
        occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_rowSpan com.gridlayout:layout_rowSpan}</code></td><td> The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.</td></tr>
           </table>
           @see #GridLayout_Layout_android_layout_column
           @see #GridLayout_Layout_android_layout_gravity
           @see #GridLayout_Layout_layout_columnSpan
           @see #GridLayout_Layout_layout_row
           @see #GridLayout_Layout_layout_rowSpan
         */
        public static final int[] GridLayout_Layout = {
            0x010100b3, 0x0101014c, 0x7f010006, 0x7f010007,
            0x7f010008
        };
        /**
          <p>
          @attr description
           The column boundary delimiting the left of the group of cells
        occupied by this view. 
          <p>This corresponds to the global attribute          resource symbol {@link com.gridlayout.R.attr#android_layout_column}.
          @attr name android:android_layout_column
        */
        public static final int GridLayout_Layout_android_layout_column = 1;
        /**
          <p>
          @attr description
           Gravity specifies how a component should be placed in its group of cells.
        The default is LEFT | BASELINE.
        See {@link android.widget.GridLayout.LayoutParams#setGravity(int)}. 
          <p>This corresponds to the global attribute          resource symbol {@link com.gridlayout.R.attr#android_layout_gravity}.
          @attr name android:android_layout_gravity
        */
        public static final int GridLayout_Layout_android_layout_gravity = 0;
        /**
          <p>
          @attr description
           The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_columnSpan
        */
        public static final int GridLayout_Layout_layout_columnSpan = 4;
        /**
          <p>
          @attr description
           The row boundary delimiting the top of the group of cells
        occupied by this view. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_row
        */
        public static final int GridLayout_Layout_layout_row = 2;
        /**
          <p>
          @attr description
           The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_rowSpan
        */
        public static final int GridLayout_Layout_layout_rowSpan = 3;
        /**  Give ourselves access to MarginLayout's styleables 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_margin com.gridlayout:android_layout_margin}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginBottom com.gridlayout:android_layout_marginBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginLeft com.gridlayout:android_layout_marginLeft}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginRight com.gridlayout:android_layout_marginRight}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginTop com.gridlayout:android_layout_marginTop}</code></td><td></td></tr>
           </table>
           @see #ViewGroup_MarginLayout_android_layout_margin
           @see #ViewGroup_MarginLayout_android_layout_marginBottom
           @see #ViewGroup_MarginLayout_android_layout_marginLeft
           @see #ViewGroup_MarginLayout_android_layout_marginRight
           @see #ViewGroup_MarginLayout_android_layout_marginTop
         */
        public static final int[] ViewGroup_MarginLayout = {
            0x010100f6, 0x010100f7, 0x010100f8, 0x010100f9,
            0x010100fa
        };
        /**
          <p>This symbol is the offset where the {@link com.gridlayout.R.attr#android_layout_margin}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_margin
        */
        public static final int ViewGroup_MarginLayout_android_layout_margin = 0;
        /**
          <p>This symbol is the offset where the {@link com.gridlayout.R.attr#android_layout_marginBottom}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginBottom
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginBottom = 4;
        /**
          <p>This symbol is the offset where the {@link com.gridlayout.R.attr#android_layout_marginLeft}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginLeft
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginLeft = 1;
        /**
          <p>This symbol is the offset where the {@link com.gridlayout.R.attr#android_layout_marginRight}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginRight
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginRight = 3;
        /**
          <p>This symbol is the offset where the {@link com.gridlayout.R.attr#android_layout_marginTop}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginTop
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginTop = 2;
    };
}
