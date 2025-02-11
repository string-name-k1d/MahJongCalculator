# Overview
The app should have a settings page, a main usage page and a records page.


## Settings Page
Ignore for now


## Main usage page
Main usage page where users access most of the functions.\
It features a GUI with 4 player icons seating around a square mahjong table where all of them are clickable buttons

### Player icons
It should display player information (empty for empty seats that should be initiaized by user) including:
- name
- balance
- custom emoji/icon (optional)
#### Interactions
It has 4 possible interactions when on click.
- Under Config state:
  - create new player (and bind to seat)
  - swap seats (can be with empty seat)
  - swap player (from existing players)
- Under On-going Game state:
  - end round (prompt to get round end type)

### Table icon
Displays current round information (e.g. Round 1-1, 1-3)\
Ignore for now
#### Interactions
- Under Config state:
  - Set round info (To be decided)
- Under On-going Game state:
  - end round (only for rounds where no one won)

## Records Page
Should display past round records with player score. Format not decided yet (pagewise or scrollable)\
Ignore for now - convert to img/pdf

# Structure
## Game
Assume to be *Singular* for now\
Main class that organises everything including:
- settings: `Settings`
- 4 player seats: `PlayerSeat`
- players: `List<Player>`
- past round records: (temporary) `DLinkedList<RecordPage>` (doubly linked)

Actions:
- register player
- register round

## Settings
ignore for now

## PlayerSeat
Located at fixed locations and contains (reference of) player sat on it
- pos
- player
### SeatPos
Enum of seatpos


## Player
Think of it as an entity that contains
- unique id
- name
- balance

Actions:
- transactons

## RoundRecord
Abstract base class for different round end types with unique id
Should share a `getRecord()` method that I havent implement
### RoundEndTypes
enum of end types, each of which has a corresponding derived class of `RoundRecord` that stores different data

## RecordPage
Fixed size array of round records with unique id
