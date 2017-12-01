import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';

import {customHttpProvider} from './helpers/index';
import {AlertComponent} from './directives/alert.component';
import {AuthGuard} from './guards/auth.guard';
import {AlertService, AuthenticationService, StudentService, LoggingService} from './services/index';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
// Routing Module
import {AppRoutingModule} from './app.routing';

import {HttpClientModule} from '@angular/common/http';

@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  declarations: [
    AppComponent,
    AlertComponent,
    HomeComponent,
    LoginComponent
  ],
  providers: [
    customHttpProvider,
    AuthGuard,
    AlertService,
    AuthenticationService,
    StudentService,
    LoggingService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
