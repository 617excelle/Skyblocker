package de.hysky.skyblocker.utils.mayor;

/**
 * Represents a minister as retrieved from the API.
 * @param key The key of the minister.
 * @param name The name of the minister.
 * @param perk The perk of the minister.
 */
public record Minister(String key, String name, Perk perk) {
	/**
	 * An empty minister. Allows for better null safety.
	 */
	public static final Minister EMPTY = new Minister("", "", Perk.EMPTY);
}
