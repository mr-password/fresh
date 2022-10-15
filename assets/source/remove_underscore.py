# !/usr/bin/python

"""
when batch exporting files, inkscape prefixes everything with _ :/
this script removes the _.
"""

import os

for root, dirs, files in os.walk("../sprites-override"):
   for name in files:
      # for some files, we don't want prefixes. remove the added _ by inkscape.
      new_name = name.lstrip("_")

      # for some files, we want prefixes. but separated with "-", not "_"
      new_name = new_name.replace("_", "-")

      old_path = os.path.join(root, name)
      new_path = os.path.join(root, new_name)

      if new_path != old_path:
         os.rename(old_path, new_path)
