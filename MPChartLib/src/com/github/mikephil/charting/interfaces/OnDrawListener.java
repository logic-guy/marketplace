package com.github.mikephil.charting.interfaces;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/**
 * Listener for callbacks when drawing on the chart.
 * 
 * @author Philipp
 * 
 */
public interface OnDrawListener {

	/**
	 * Called whenever an entry is added with the finger. Note this is also called for entries that are generated by the
	 * library, when the touch gesture is too fast and skips points.
	 * 
	 * @param entry
	 *            the last drawn entry
	 */
	public void onEntryAdded(Entry entry);

	/**
	 * Called when drawing finger is lifted and the draw is finished.
	 * 
	 * @param dataSet
	 *            the last drawn DataSet
	 */
	public void onDrawFinished(DataSet dataSet);

}
