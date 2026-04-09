# Design System Strategy: Kinetic Elegance

## 1. Overview & Creative North Star
The Creative North Star for this design system is **"The Kinetic Concierge."** 

In the high-velocity world of urban mobility, users don't just need a booking tool; they need a seamless, frictionless companion that feels as fast as the ride they are ordering. We are moving beyond the "generic utility" of standard taxi apps to create an editorial-grade experience. By utilizing high-contrast typography scales and intentional asymmetry, we break the rigid Material Design grid. The interface should feel like it is in motion—using overlapping layers, generous breathing room, and a sophisticated depth model that replaces antiquated "box-and-line" layouts.

---

## 2. Colors & Surface Architecture
Our palette centers on a high-energy **Primary (#6d5a00 / #fdd400)** that signals "Go" and "Cautionary Attention," paired with a deep, authoritative **Secondary (#5c5b5b)** for absolute legibility.

### The "No-Line" Rule
To achieve a premium feel, **1px solid borders are strictly prohibited for sectioning.** Boundaries must be defined solely through background color shifts. For example, a card should not have an outline; instead, place a `surface-container-low` card against a `surface` background. 

### Surface Hierarchy & Nesting
Treat the UI as a physical stack of semi-translucent materials.
*   **Base:** `surface` (#f9f6f5) for the main application background.
*   **Tier 1:** `surface-container-low` (#f3f0ef) for secondary information groups.
*   **Tier 2:** `surface-container-highest` (#dfdcdc) for interactive elements like input fields or map-overlay sheets.
*   **Floating Elements:** Use the **Glassmorphism Rule.** Apply `surface-container-lowest` (#ffffff) with 85% opacity and a 20px `backdrop-blur`. This allows the map or background activity to bleed through, softening the UI’s edges.

### Signature Textures
Avoid flat primary colors for high-impact CTAs. Use a subtle linear gradient (Top-Left to Bottom-Right) transitioning from `primary` (#6d5a00) to `primary-container` (#fdd400). This adds a "metallic luster" that feels like car paint under streetlights.

---

## 3. Typography: The Editorial Edge
We employ a dual-font strategy to balance character with utility.

*   **Display & Headlines (Plus Jakarta Sans):** These are our "speed markers." Use `display-lg` (3.5rem) and `headline-md` (1.75rem) for booking confirmations and driver ETAs. The wide aperture of Plus Jakarta Sans feels modern and friendly.
*   **Body & Titles (Inter):** Inter is used for all "high-utility" data—license plates, pricing, and address inputs. It provides the neutral, Swiss-style precision required for reliability.
*   **Visual Hierarchy:** Use dramatic scale shifts. A large `display-sm` arrival time should sit next to a tiny, all-caps `label-md` "MINUTES AWAY" to create a sense of urgency and clarity.

---

## 4. Elevation & Depth
Depth in this system is achieved through **Tonal Layering** rather than structural geometry.

*   **The Layering Principle:** Stacking tiers (e.g., a `surface-container-lowest` card on a `surface-container-low` section) creates a natural lift that mimics real-world lighting.
*   **Ambient Shadows:** For floating action buttons (FABs) or navigation bars, use an extra-diffused shadow: `box-shadow: 0 12px 32px rgba(47, 46, 46, 0.06);`. The shadow color is a tint of our `on-surface` (#2f2e2e), ensuring it feels like a natural shadow on asphalt rather than a "drop shadow" effect.
*   **The Ghost Border:** If contrast is legally required for accessibility, use `outline-variant` (#afacac) at **15% opacity**. It should be felt, not seen.

---

## 5. Components & Primitives

### Buttons: The "Engine"
*   **Primary:** Rounded `lg` (2rem) or `full` (9999px). Gradient background (`primary` to `primary-container`). White text for high-contrast visibility.
*   **Secondary:** `secondary-container` (#e5e2e1) background with `on-secondary-container` text. These are for "Edit Trip" or "Schedule Later" actions.
*   **Tertiary:** No background, `primary` text. Used for "Cancel" or "Terms."

### Input Fields: The "Dashboard"
*   **Styling:** Forgo the standard Material underlined box. Use a `surface-container-highest` background with a `DEFAULT` (1rem) roundedness.
*   **States:** On focus, use a `primary` "Ghost Border" (20% opacity) and shift the background to `surface-container-lowest`.

### Cards & Lists: The "No-Divider" Rule
*   **Forbid the use of divider lines.** To separate driver profiles or trip history, use vertical white space (8px or 16px) or alternate between `surface-container-low` and `surface-container-highest`. This keeps the "stream" of information flowing without visual "speed bumps."

### Specialized Component: The "Trip Sheet"
A bottom-anchored modal using **Glassmorphism**. It should use `surface-container-lowest` at 90% opacity, a `backdrop-blur` of 24px, and a `xl` (3rem) top corner radius. This creates a "soft landing" for the user's thumb.

---

## 6. Do’s and Don'ts

### Do:
*   **Do** use asymmetrical margins. Offsetting a headline slightly from the body text creates a high-end, editorial feel.
*   **Do** use bold, 2px stroke icons. They should be "on-surface" color for clarity.
*   **Do** use the `full` roundedness scale for small chips (e.g., "Fastest" or "Luxury" labels).

### Don’t:
*   **Don’t** use pure black (#000000). Use `inverse-surface` (#0e0e0e) for the deepest blacks to maintain tonal warmth.
*   **Don’t** use 100% opaque shadows. They make the app feel "heavy" and dated.
*   **Don’t** use standard Material "Ripple" effects in their default grey; use a subtle `primary` tint for the ripple to reinforce brand identity during interaction.