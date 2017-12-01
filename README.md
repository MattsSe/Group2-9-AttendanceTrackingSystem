# Group2-9-AttendanceTrackingSystem
Project repository for the ASE project


### Installation

You need [yarn](https://yarnpkg.com/lang/en/docs/install/) installed.

```
# clone the repo
git clone git@github.com:NandaYogeshwar/Group2-9-AttendanceTrackingSystem.git
cd Group2-9-AttendanceTrackingSystem

# build the web client using yarn
cd ase-webclient
yarn
yarn run build:deploy

# run the server locally
cd ../ase-server
mvn appengine:devserver
# server is now up and running at localhost:8080

```
Interact with the server via the defined API: [https://ase-2017-group-2-9-attendance.restlet.io/](https://ase-2017-group-2-9-attendance.restlet.io/)
